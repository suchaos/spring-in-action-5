package com.suchaos.tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Taco
 *
 * @author suchao
 * @date 2018/10/26
 */
@Data
public class Taco {

    private String name;
    private List<String> ingredients;

}
