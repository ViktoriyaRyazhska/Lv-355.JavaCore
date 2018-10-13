package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float[] fNumbers = new float[3];
        boolean fCheck = true;

        System.out.println("3 float:");

        for (int i = 0; i < 3; i++) {
            fNumbers[i] = Float.parseFloat(br.readLine());
            if (fNumbers[i] < -5 || fNumbers[i] > 5) {
                fCheck = false;
            }
        }

        System.out.println("Check:" + fCheck);

        int[] iNumbers = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("3 integer:");

        for (int i = 0; i < 3; i++) {
            iNumbers[i] = Integer.parseInt(br.readLine());
            if (iNumbers[i] > max) {
                max = iNumbers[i];
            }
            if (iNumbers[i] < min) {
                min = iNumbers[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println("HTTPError:");

        int httpError = Integer.parseInt(br.readLine());

        HttpError error;

        switch (httpError) {
            case 400:
                error = HttpError.BAD_REQUEST;
                break;
            case 401:
                error = HttpError.UNAUTHORIZED;
                break;
            case 402:
                error = HttpError.PAYMENT_REQUIRED;
                break;
            default:
                error = HttpError.NO_ERROR;
                break;
        }

        System.out.println(error);

    }

}
