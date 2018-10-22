package com.swich.test;

public class Eagle extends FlyingBird{

    public Eagle() {
        feathers = true;
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
