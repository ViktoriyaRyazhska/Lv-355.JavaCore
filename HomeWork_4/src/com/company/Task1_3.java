package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_3 {

	public static void main(String[] args) throws IOException {
		
		HTTPError e;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number of Error: ");
		int error = Integer.parseInt(br.readLine());
		
		switch(error) {
		case 400:
			e = HTTPError.Bad_Request;
			break;
		case 401:
			e = HTTPError.Unauthorized;
			break;
		case 402:
			e = HTTPError.Server_Error;
			break;
		case 403:
			e = HTTPError.Forbidden;
			break;
		case 404:
			e = HTTPError.Not_Found;
			break;
		default:
			e = HTTPError.Others;
		}
		System.out.println("The name of Error is " + "'" + e + "'");
	}
}