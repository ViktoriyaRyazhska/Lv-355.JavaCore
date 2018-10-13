package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }

        int c = 0;
        for (int i = 0; i < 3; i++) {
            if (n[i] % 2 == 1){
                c++;
            }
        }

        System.out.println("Odd: " + c);

    }
}