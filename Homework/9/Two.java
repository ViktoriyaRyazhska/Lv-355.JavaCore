package com.swich.test;

public class Two extends Thread {

    @Override
    public void run() {

        Three t3 = new Three();
        t3.start();

        for (int i = 0; i < 3; i++) {

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread two");

        }

    }

}
