package com.swich.test;

import java.io.*;
import java.util.ArrayList;

public class Main4 {

    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new FileReader("file1.txt"))) {

            ArrayList<String> strings = new ArrayList<>();

            String s;
            while ((s = br.readLine()) != null) {
                strings.add(s);
            }


            try(BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"))) {

                bw.write(String.valueOf(strings.size()) + "\n");

                String l = "";
                for (String ss : strings){
                    if (ss.length() > l.length()){
                        l = ss;
                    }
                }
                bw.write(l + "\n");
                bw.write("Artem 28.04.2003");

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
