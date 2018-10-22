package com.swich.test;

public class Main1 {

    public static void main(String[] args) {

        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};

        for(Bird bird : birds){
            System.out.println(bird);
            System.out.println("Can fly: " + bird.fly());
        }

    }

}
