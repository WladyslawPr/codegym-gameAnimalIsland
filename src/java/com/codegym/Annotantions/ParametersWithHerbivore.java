package com.codegym.Annotantions;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ParametersWithHerbivore {

    double weight() default 0.01;
    int maxCountPerCell() default 10;
    int speedCellsPerTurn() default 3;
    double maxSaturation() default 0;
}
