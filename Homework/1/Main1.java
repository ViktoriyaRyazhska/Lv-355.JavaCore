package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("First number: ");

        int a = Integer.parseInt(br.readLine());

        System.out.print("Second number: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));


    }

}
