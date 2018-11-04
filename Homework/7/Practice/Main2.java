package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] ss = s.split(" ");

        String surname = ss[0];
        String name = ss[1];
        String patronymic = ss[2];

        System.out.println(surname + " " + name.charAt(0) + patronymic.charAt(0));
        System.out.println(name);
        System.out.println(name + " " + patronymic + " " + surname);

    }

}
