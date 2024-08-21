package com.e2mg.java.lock;

public class IntegerLock {

    private static final Integer lockA = new Integer(0);
    private static final Integer lockB = new Integer(0);

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            synchronized (lockA) {
                System.out.println("A");
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(1);
            }
        }).start();

        Thread.sleep(3000);

        new Thread(()->{
            synchronized (lockB) {
                System.out.println("B");
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(1);
            }
        }).start();
    }
}
