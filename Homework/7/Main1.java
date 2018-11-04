package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] words = s.split(" ");
        int ix= 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > words[ix].length()){
                ix = i;
            }
        }
        System.out.println(words[ix]);

        System.out.println(words[ix].length());

        StringBuilder sb = new StringBuilder(words[1]);

        System.out.println(sb.reverse());

    }

}
