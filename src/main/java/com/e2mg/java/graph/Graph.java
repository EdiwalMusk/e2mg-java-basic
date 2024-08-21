package com.e2mg.java.graph;

public class Graph {

    public static void main(String[] args) throws InterruptedException {
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
