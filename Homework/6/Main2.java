package com.swich.test;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            personMap.put("LN" + i, "FN" + (int) (Math.random() * 10));
        }

        System.out.println(personMap);

        boolean find = false;
        for (Map.Entry<String, String> e1 : personMap.entrySet()) {
            for (Map.Entry<String, String> e2 : personMap.entrySet()) {

                if (!e1.getKey().equals(e2.getKey()) && e1.getValue().equals(e2.getValue())) {
                    find = true;
                    break;

                }

            }

        }

        System.out.println("Are same first names: " + find);

        personMap.entrySet().removeIf(o -> o.getValue().equals("FN5"));

        System.out.println(personMap);

    }

}
