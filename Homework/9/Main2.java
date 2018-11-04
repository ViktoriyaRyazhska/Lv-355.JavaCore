package com.swich.test;

public class Main2 {

    private final static Object first = new Object();
    private final static Object second = new Object();

    public static void main(String s[]) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success!");
                    }
                }
            }
        };
        t1.start();
        synchronized (second) {
            Thread.yield();
            synchronized (first) {
                System.out.println("Success!");
            }
        }
    }

}
