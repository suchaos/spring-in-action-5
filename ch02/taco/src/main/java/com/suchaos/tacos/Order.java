package com.suchaos.tacos;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * Order
 *
 * @author suchao
 * @date 2018/10/26
 */
@Data
public class Order {

    private String name;

    private String street;

    private String city;

    private String state;

    private String zip;

    private String ccNumber;

    private String ccExpiration;

    private String ccCVV;

}
