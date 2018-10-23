package com.swich.test;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();

        ArrayList<Integer> ind = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int n;
            n = (int) (Math.random() * 30);
            n *= (Math.random() > 0.5 ? -1 : 1);
            ints.add(n);

            if (ints.get(i) > 5) {
                ind.add(i);
            }
        }

        System.out.println("Ints: " + ints);

        System.out.println("Index of < 5 : " + ind);

        ints.removeIf(integer -> integer > 20);

        System.out.println("Removed if > 20 : " + ints);

        if (ints.size() > 2) {
            ints.add(2, 1);
            if (ints.size() > 5) {
                ints.add(5, -4);
                if (ints.size() > 8) {
                    ints.add(8, -3);
                }
            }
        }

        for (int i = 0; i < ints.size(); i++) {
            System.out.println("Index: " + i + " Element: " + ints.get(i));
        }

        ints.sort(Comparator.comparingInt(a -> a));

        System.out.println("Sorted: " + ints);


    }

}
