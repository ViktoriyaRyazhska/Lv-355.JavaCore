package com.swich.test;

public class Chicken extends NonFlyingBird {

    public Chicken() {
        feathers = true;
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

}
