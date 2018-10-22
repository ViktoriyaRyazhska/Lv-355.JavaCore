package com.swich.test;

public class Dog implements Animal{

    @Override
    public void voice() {
        System.out.println("Bark");
    }

    @Override
    public void feed() {
        System.out.println("Dog eats");
    }
}
