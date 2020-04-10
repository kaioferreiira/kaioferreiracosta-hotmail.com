package br.com.wallet.api.v1.contracts;


import br.com.wallet.business.dto.UserDTOV1;
import java.util.List;
import org.springframework.http.ResponseEntity;

public interface UserRestEndpointV1 {

    ResponseEntity<List<UserDTOV1>> findAllUsers();

    ResponseEntity<Void> addNewUser(UserDTOV1 userDTOV1);

    ResponseEntity<UserDTOV1> findUser(Integer id);

    ResponseEntity<Void> updateUser(Integer idUser, UserDTOV1 userDTOV1);

    ResponseEntity<UserDTOV1> deleteUser(Integer id);

//    ResponseEntity<Void> editarSenhaUser(String email, String novaSenha);

}
