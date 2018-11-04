package com.swich.test;

public class One extends Thread {

    @Override
    public void run(){

        Two t2 = new Two();
        t2.start();

        System.out.println("Thread one");

    }

}
