package com.swich.test;

public class ThreadMain1 extends Thread {

    private String name;
    private int pause;

    public ThreadMain1(String name, int pause) {
        this.name = name;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
