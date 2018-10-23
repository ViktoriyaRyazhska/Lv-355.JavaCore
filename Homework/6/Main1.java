package com.swich.test;

import java.util.HashSet;
import java.util.Set;

public class Main1 {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            s1.add((int) (Math.random() * 10));
            s2.add((int) (Math.random() * 10));
        }

        System.out.println(s1);
        System.out.println(s2);

        Set s1u2 = union(s1, s2);

        System.out.println("Union: " + s1u2);

        Set s1i2 = intersection(s1, s2);

        System.out.println("Intersection: " + s1i2);

    }

    public static Set union(Set set1, Set set2) {

        Set res = new HashSet<>();
        res.addAll(set1);
        res.addAll(set2);
        return res;

    }

    public static Set intersection(Set set1, Set set2) {

        Set res = new HashSet<>();

        for (Object obj : set1) {
            if (set2.contains(obj)) {
                res.add(obj);
            }
        }

        return res;

    }

}
