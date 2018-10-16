package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int res = getRes(arr);

        System.out.println(res);

    }

    private static int getRes(int[] arr){
        int res;

        boolean b = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] < 0){
                b = false;
                break;
            }
        }
        if (b){
            res = 0;
            for (int i = 0; i < arr.length/2; i++) {
                res += arr[i];
            }
        }else {
            res = 1;
            for (int i = arr.length/2; i < arr.length; i++) {
                res *= arr[i];
            }
        }

        return res;
    }

}
