package com.e2mg.java.concurrent;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 描述
 *
 * @author EdiwalMusk
 * @date 2023/3/16 15:57
 */
public class FutureTaskTest {

    /**
     * 测试阻塞
     *
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void test1() throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            return "1";
        });
        Thread t1 = new Thread(futureTask);
        t1.start();
        System.out.println(futureTask.get());
    }
}

class MyThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("comon in");
        return "abc";
    }
}
