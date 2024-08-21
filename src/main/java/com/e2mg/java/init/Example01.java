package com.e2mg.java.init;

public class Example01 {
    private int a = getA(0);
    {
        System.out.println("Example01 block!");
    }
    private int b = getA(1);

    public Example01() {
        System.out.println("Example01 constructor!");
    }

    private static int c = getB(0);
    static {
        System.out.println(4);
    }
    private static int d = getB(0);
    static {
        System.out.println(5);
    }

    private int getA(int param) {
        System.out.println("getA " + param);
        return 10;
    }

    private static int getB(int param) {
        System.out.println("getB " + param);
        return 10;
    }
}
