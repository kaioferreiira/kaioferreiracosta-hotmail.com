package br.com.wallet.api.v1;


import br.com.wallet.api.v1.contracts.UserRestEndpointV1;
import br.com.wallet.business.dto.UserDTOV1;
import br.com.wallet.business.service.v1.UserServiceImplV1;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/v1/users"})
public class UserRestV1 implements UserRestEndpointV1 {


    private UserServiceImplV1 userServiceV1;

    @Autowired
    public UserRestV1(UserServiceImplV1 userServiceV1) {
        this.userServiceV1 = userServiceV1;
    }

    @Override
//    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(path = "/findAll",
            produces = "application/vnd.central.erros.user-v1+json"
    )
    @ApiOperation(value = "Retorna todos usuários cadastrados", response = UserDTOV1.class)
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "Authorization", required = true, dataType = "string", paramType = "header", value = "Token de autenticação.")
//    })
    public ResponseEntity<List<UserDTOV1>> findAllUsers() {

        ResponseEntity<List<UserDTOV1>> response = ResponseEntity.ok(userServiceV1.findAllUsers());
        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }
        return response;
    }

    @Override
    @PostMapping("/")
    @ApiOperation(value = "Save new User ")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "Authorization", required = true, dataType = "string", paramType = "header", value = "Token de autenticação.")
//    })
    public ResponseEntity<Void> addNewUser(UserDTOV1 userRequest) {

        userServiceV1.saveNewUser(userRequest);

        return ResponseEntity.ok().build();
    }


    @Override
    @GetMapping(path = "/{id}",
            produces = "application/vnd.central.erros.user-v1+json"
    )
    @ApiOperation(value = "Retorna um usuário cadastrado", response = UserDTOV1.class)
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "Authorization", required = true, dataType = "string", paramType = "header", value = "Token de autenticação.")
//    })
    public ResponseEntity<UserDTOV1> findUser(@Valid @PathVariable Integer id) {
        return ResponseEntity.ok(userServiceV1.findUserById(id));
    }

    @Override
    public ResponseEntity<Void> updateUser(Integer idUser, UserDTOV1 userDTOV1) {
        return null;
    }

    @Override
    public ResponseEntity<UserDTOV1> deleteUser(Integer id) {
        return null;
    }


}
