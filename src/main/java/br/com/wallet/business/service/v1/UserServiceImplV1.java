package br.com.wallet.business.service.v1;

import br.com.wallet.business.dto.UserDTOV1;
import br.com.wallet.business.entity.V1.UserV1;
import br.com.wallet.business.entity.converter.UserConverter;
import br.com.wallet.business.exception.exceptions.ObjectNotFoundException;
import br.com.wallet.business.repository.V1.UserRepository;
import br.com.wallet.business.service.v1.contracts.UserServiceV1;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplV1 implements UserServiceV1 {

    private UserRepository userRepositoryV1;

    @Autowired
    public UserServiceImplV1(UserRepository userRepositoryV1) {
        this.userRepositoryV1 = userRepositoryV1;
    }

    @Override
    public List<UserDTOV1> findAllUsers() {
        List<UserV1> listaFuncionarios = userRepositoryV1.findAll();

        List<UserDTOV1> listFuncionarioDTOV5 =
                listaFuncionarios.stream().map(UserConverter::userToDTO).collect(Collectors.toList());

        return listFuncionarioDTOV5;
    }

    @Override
    public UserDTOV1 findUserById(Integer id){

        Optional<UserV1> obj = userRepositoryV1.findById(id);
        obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + UserV1.class.getName()));
        return UserConverter.userToDTO(obj.get());

    }

    @Override
    public UserDTOV1 saveNewUser(UserDTOV1 userInput) {
//        String senhaEncode = bCryptPasswordEncoder.encode(userInput.getSenha());
//        userInput.setSenha(senhaEncode);
        UserV1 usuarioSalvoNoBanco = userRepositoryV1.save(UserConverter.userDTOToEntity(userInput));
        return UserConverter.userToDTO(usuarioSalvoNoBanco);
    }

}
