package br.com.wallet.business.service.v1.contracts;


import br.com.wallet.business.dto.UserDTOV1;
import java.util.List;

public interface UserServiceV1 {

    List<UserDTOV1> findAllUsers();

    UserDTOV1 saveNewUser(UserDTOV1 userDTOV1);

    UserDTOV1 findUserById(Integer id);

}
