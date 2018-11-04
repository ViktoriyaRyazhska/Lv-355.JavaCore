package com.swich.test;

public class Main1 {

    public static void main(String[] args) {

        Double a = 43.32;
        Double b = 0.0;

        try {
            Double c = div(a, b);
            System.out.println(c);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

    }

    public static Double div(Double a, Double b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }

}
