package com.e2mg.java.concurrent;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 描述
 *
 * @author EdiwalMusk
 * @date 2023/3/16 16:42
 */
public class CompletableFutureTest {

    @Test
    public void test1() throws ExecutionException, InterruptedException {
        CompletableFuture future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(future.get());
    }

    @Test
    public void test2() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()->{
            return 1;
        });
        System.out.println(future.get());
    }
}
