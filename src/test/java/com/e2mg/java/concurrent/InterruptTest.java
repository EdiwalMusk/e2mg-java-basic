package com.e2mg.java.concurrent;

import org.junit.Test;

/**
 * 描述
 *
 * @author EdiwalMusk
 * @date 2023/3/16 15:57
 */
public class InterruptTest {


    @Test
    public void test() throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("a");
                    return;
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("b");
                }
            }
        });
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
