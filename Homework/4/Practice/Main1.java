package com.swich.test;

public class Main1 {

    public static void main(String[] args) {

        int[] arr = {1, -5, 2, 6, -6, 3, 0, 4, 1, 7};
        int max = arr[0];
        int sum = 0;
        int countN = 0;
        int countP = 0;
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
            if (n > 0) {
                countP++;
                sum += n;
            }
            if (n < 0) {
                countN++;
            }
        }

        System.out.println(max + " " + sum + " " + countN);
        System.out.println("More " + (countN > countP ? "negative" : "positive"));

    }

}
