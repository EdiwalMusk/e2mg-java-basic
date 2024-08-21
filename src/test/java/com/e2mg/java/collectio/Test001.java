package com.e2mg.java.collectio;

import org.junit.Assert;
import org.junit.Test;

public class Test001 {


    @Test
    public void test() throws Exception {
        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);
        Assert.assertSame(a, b);
        Assert.assertEquals(a, b);
//        Assert.assertArrayEquals();
    }
}
