package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    private static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int day = Integer.parseInt(br.readLine());

        System.out.println(getDays(day));

    }

    private static int getDays(int day){
        day--;
        if (day < 0 || day > days.length - 1){
            return -1;
        }
        return days[day];
    }

}
