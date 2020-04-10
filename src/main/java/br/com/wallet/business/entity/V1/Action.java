package br.com.wallet.business.entity.V1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Action implements Serializable {


    private static final long serialVersionUID = -7984679688863296647L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true)
    private String cod;

    private BigDecimal purchaseQuote;

    private BigDecimal grossPurchaseAmount;

    private LocalDateTime purchaseDate;



}
