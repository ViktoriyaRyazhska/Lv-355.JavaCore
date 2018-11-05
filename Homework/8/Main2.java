package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args){

        int n;
        for (int i = 0; i < 10; i++) {
            try {
                n = readNumber(1, 100);
                System.out.println(n);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static int readNumber(int start, int end) throws IOException, NumberFormatException {

        int n = Integer.parseInt(br.readLine());

        if (n >= start && n <= end){
            return n;
        }else {
            throw new NumberFormatException("Your number not in range [" + start + " " + end + "]!");
        }

    }

}
