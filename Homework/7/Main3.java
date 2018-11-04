package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Pattern p = Pattern.compile("\\$\\d+(\\.\\d{2}){0,1}");
        Matcher m;

        for (int i = 0; i < 3; i++) {
            String num = br.readLine();
            m = p.matcher(num);
            if (m.matches()){
                System.out.println(num + " good!");
            }else {
                System.out.println(num + " bad!");
            }
        }


    }

}

