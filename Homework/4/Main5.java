package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car[] cars = new Car[4];
        cars[0] = new Car("T1", 2009, 4);
        cars[1] = new Car("T2", 2014, 5);
        cars[2] = new Car("T3", 2014, 8);
        cars[3] = new Car("T4", 2016, 2);

        HashSet<Integer> years = new HashSet<>();

        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() > cars[j].getYear()){
                    Car tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }

        for (Car c : cars){
            years.add(c.getYear());
            System.out.println(c);
        }

        String y = "Years: ";
        for (int year : years){
            y += year + " ";
        }
        System.out.println(y);
        System.out.println("Enter year: ");

        int year = Integer.parseInt(br.readLine());

        if (years.contains(year)){
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].getYear() == year){
                    System.out.println(cars[i]);
                }
            }
        }else {
            System.out.println("Wrong year!");
        }

    }

}
