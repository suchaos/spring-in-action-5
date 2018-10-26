package com.suchaos.tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * domain object
 *
 * @author suchao
 * @date 2018/10/26
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
