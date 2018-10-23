package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> employeeMap = new HashMap<>();

        for (int i = 0; i < 7; i++) {
            employeeMap.put(i, "Employee " + 1);
        }

        System.out.println("Enter id:");
        int id = Integer.parseInt(br.readLine());

        System.out.println(employeeMap.getOrDefault(id, "Can't find anyone with id " + id));

        System.out.println("Enter name:");

        String name = br.readLine();

        ArrayList<Integer> keys = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                keys.add(entry.getKey());
            }
        }

        System.out.println((keys.size() > 0 ? "Id's with name " + name + " : " + keys : "Can't find anyone with name " + name));

    }

}
