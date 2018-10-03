package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mein5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double[] country = new Double[3];
        Double[] time = new Double[3];

        Double[] price = new Double[3];

        for (int i = 0; i < 3; i++) {
            country[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < 3; i++) {
            time[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < 3; i++) {
            price[i] = country[i] * time[i];
            System.out.println("Price: " + price[i]);
        }

    }

}
