package com.codegym.Annotantions;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ParametersWithCarnivore {

    double weight() default 6;
    int maxCountPerCell() default 30;
    int speedCellsPerTurn() default 2;
    double maxSaturation() default 1;
}
