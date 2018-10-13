package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String country = br.readLine();

        Continents continent;

        switch (country.toLowerCase()) {
            case "armenia":
            case "georgia":
                continent = Continents.ASIA;
                break;
            case "benin":
            case "somalia":
                continent = Continents.AFRICA;
                break;
            case "nauru":
            case "tonga":
                continent = Continents.AUSTRALIA;
                break;
            case "latvia":
            case "ukraine":
                continent = Continents.EUROPE;
                break;
            case "cuba":
            case "panama":
                continent = Continents.NORTHAMERICA;
                break;
            case "ecuador":
            case "venezuela":
                continent = Continents.SOUTHAMERICA;
                break;
            default:
                continent = Continents.NOSUCH;
                break;

        }

        System.out.println(continent);

    }

}
