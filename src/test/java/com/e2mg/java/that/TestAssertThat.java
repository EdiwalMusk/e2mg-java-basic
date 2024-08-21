package com.e2mg.java.that;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestAssertThat {

    @Test
    public void testAssert() {
        assertThat(1, allOf(equalTo(1), lessThan(2)));
        assertThat(Arrays.asList("fun", "ban", "net"), everyItem(containsString("n")));
        assertThat(Arrays.asList("fun", "ban", "net"), hasItems("fun"));
        assertThat(new Object(), is(sameInstance(new Object())));
    }

    @Test
    public void testDouble() {
        double num = 0.0d;
        double result = Math.cos(1 / num);
        if (result == Double.NaN) {
            System.out.println("result is NaN");
        }
    }

    @Test
    public void testDouble2() {
        double num = 0.0d;
        double result = Math.cos(1 / num);
        if (Double.isNaN(result)) {
            System.out.println("result is NaN");
        }
    }

    @Test
    public void testFloat() {
        float flt1 = (float) 2000000000;
        System.out.println(flt1 < 2000000050f);
        for (float flt = (float) 2000000000; flt < 2000000050f; flt++) {
            System.out.println(flt);
        }
//        for (int i = 2000000000; i < 2000000050; i++) {
//            System.out.println(i);
//        }
    }
}
