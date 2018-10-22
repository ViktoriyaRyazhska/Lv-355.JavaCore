package com.swich.test;

public class Swallow extends FlyingBird {

    public Swallow() {
        feathers = true;
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

}
