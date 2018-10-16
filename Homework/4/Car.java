package com.swich.test;

import java.util.Objects;

public class Car {

    private String type;
    private int year;
    private int engine;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                engine == car.engine &&
                Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, year, engine);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public Car(String type, int year, int engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }
}
