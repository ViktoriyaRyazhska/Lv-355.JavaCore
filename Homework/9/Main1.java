package com.swich.test;

public class Main1 {

    public static void main(String[] args) {

        ThreadMain1 t1 = new ThreadMain1("T1", 300);
        ThreadMain1 t2 = new ThreadMain1("T2", 200);
        ThreadMain1 t3 = new ThreadMain1("T3", 100);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();

    }

}
