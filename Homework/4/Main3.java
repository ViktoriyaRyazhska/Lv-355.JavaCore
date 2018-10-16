package com.swich.test;

public class Main3 {

    public static void main(String[] args) {

        int[] n = {1, -3, -7, 3, 6};
        
        boolean findOne = false;
        int ix = -1;

        int iy = 0;

        for (int i = 0; i < n.length; i++) {
            if (findOne && n[i] > 0 && ix == -1){
                ix = i;
            }
            if (n[i] > 0){
                findOne = true;
            }
            if (n[i] < n[iy]){
                iy = i;
            }
        }

        System.out.println("Second positive number at: " + ix);
        System.out.println("Min at: " + iy);
        System.out.println("Min: " + n[iy]);

    }

}
