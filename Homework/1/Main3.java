package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Radius: ");

        double r = Double.parseDouble(br.readLine());

        System.out.println("Perimeter: " + (2 * Math.PI * r));
        System.out.println("Area: " + (Math.PI * r * r));

    }

}
