package com.swich.test;

public class Three extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            try {
                sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread three");

        }

    }

}
