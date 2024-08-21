package com.e2mg.java.parameter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;

@RunWith(Parameterized.class)
public class Test003 {

    @Parameterized.Parameter
    public Integer arg1;

    @Parameterized.Parameter(1)
    public Callable<Boolean> arg2;

    @Parameterized.Parameters
    public static Collection<?> parameters() {
        return Arrays.asList(new Object[][]{
                {
                        2, (Callable<Boolean>) () -> true
                }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void test() throws Exception {
        Boolean result = arg2.call();
    }
}
