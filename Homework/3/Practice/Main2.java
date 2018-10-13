package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String ans;

        switch (n) {
            case 1:
                ans = "Понеділок Monday måndag";
                break;
            case 2:
                ans = "Вівторок Tuesday tisdag";
                break;
            case 3:
                ans = "Середа Wednesday onsdag";
                break;
            case 4:
                ans = "Четвер Thursday torsdag";
                break;
            case 5:
                ans = "П'ятниця Friday fredag";
                break;
            case 6:
                ans = "Субота Saturday lördag";
                break;
            case 7:
                ans = "Неділя Sunday söndag";
                break;
            default:
                ans = "Wrong!";
        }

        System.out.println(ans);

    }

}
