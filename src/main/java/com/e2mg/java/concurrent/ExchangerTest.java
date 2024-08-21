package com.e2mg.java.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述
 *
 * @author EdiwalMusk
 * @date 2023/3/16 15:57
 */
public class ExchangerTest {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Exchanger<String> exchanger = new Exchanger<>();
        es.submit(()->{
            try {
                String a = exchanger.exchange("a");
                System.out.println(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        es.submit(()->{
            try {
                String a = exchanger.exchange("b");
                System.out.println(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        es.shutdown();
    }
}
