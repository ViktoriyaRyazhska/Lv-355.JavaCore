package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("S1: ");
        String s1 = br.readLine();
        System.out.print("S2: ");
        String s2 = br.readLine();

        System.out.println("S2 contains S1: " + s2.contains(s1));

    }

}
