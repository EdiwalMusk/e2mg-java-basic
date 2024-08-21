package com.e2mg.java.parameter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

@RunWith(Parameterized.class)
public class Test004 {

    private Integer arg1;

    private Callable<Boolean> arg2;

    public Test004(Integer arg1, Callable<Boolean> arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Parameterized.Parameters
    public static Map<Integer, Boolean> parameters() {
        return new HashMap<Integer, Boolean>() {{
            put(123, false);
        }};
    }

    @Test(expected = IllegalArgumentException.class)
    public void test() throws Exception {
        Boolean result = arg2.call();
//        Assert.assertEquals(result, this.exex);
    }
}
