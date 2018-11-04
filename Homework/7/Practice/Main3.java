package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;

        Pattern p = Pattern.compile("\\w{3,15}");
        Matcher m;

        for (int i = 0; i < 5; i++) {
            name = br.readLine();
            m = p.matcher(name);
            System.out.println(m.matches());
        }

    }

}
