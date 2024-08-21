package com.e2mg.java.type;

public class Main {

    public static void main(String[] args) {
        int nr = 2147483642;
        nr += 1.0f;
        System.out.println(nr);

        int big = 1999999999;
        float one = 1.0f;
        System.out.println(big * one);

        double nr2 = 2147483642;
        nr2 *= 1.0;
        System.out.println(nr2);

        int big2 = 1999999999;
        double one2 = 1.0d;
        System.out.println((double) big2 * one2);

        char c1 = 'f';
        char c3 = '\n';
        char c5 = '\u0012';
        System.out.println(c5);
    }
}
