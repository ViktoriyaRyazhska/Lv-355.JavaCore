package hm3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Error (chose from: 400, 401, 402, 403, 404):");
		int error = Integer.parseInt(br.readLine());
		
		HTTPError errorName = null;
		System.out.println(errorMethod(error, errorName));
	}
	
	public static HTTPError errorMethod(int error, HTTPError errorName) {
		switch (error) {
		case 400:
			errorName = HTTPError.BadRequest;
			break;
		case 401:
			errorName = HTTPError.Unauthorized;
			break;
		case 402:
			errorName = HTTPError.PaymentRequired;
			break;
		case 403:
			errorName = HTTPError.Forbidden;
			break;
		case 404:
			errorName = HTTPError.NotFound;
			break;
		}
		return errorName;
	}
}
