package com.e2mg.java.calc;

import java.util.function.IntUnaryOperator;

public class InitOpe {

    public static void main(String[] args) {
        IntUnaryOperator multi = (a) -> a * 4;
        IntUnaryOperator add = (a) -> a + 2;
        System.out.println(multi.andThen(add).andThen(add).applyAsInt(1));
        System.out.println(multi.compose(add).applyAsInt(1));
    }
}
