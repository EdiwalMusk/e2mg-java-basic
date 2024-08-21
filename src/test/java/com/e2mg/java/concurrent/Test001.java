package com.e2mg.java.concurrent;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test001 {

    @Test
    public void test() {
        AtomicIntegerArray a = new AtomicIntegerArray(10);
        System.out.println(a.getAndAdd(0, 10));
        System.out.println(a.getAndAdd(0, 10));
    }
}
