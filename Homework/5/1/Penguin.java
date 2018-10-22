package com.swich.test;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        feathers = false;
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

}
