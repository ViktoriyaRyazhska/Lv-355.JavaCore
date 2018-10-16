package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = 1;

        int n;
        do {
            n = Integer.parseInt(br.readLine());
            if (n % 2 == 0) {
                p *= n;
            }
        } while (n > 0);


        System.out.println(p);

    }

}
