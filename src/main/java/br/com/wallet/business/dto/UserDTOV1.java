package br.com.wallet.business.dto;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTOV1 {

    private String nome;
    private String email;
    private String cpfOuCnpj;
    private Integer tipo;
    private String senha;


}
