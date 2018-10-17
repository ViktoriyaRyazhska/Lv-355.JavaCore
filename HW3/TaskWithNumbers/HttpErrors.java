package TaskWithNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpErrors {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		HTTP error;
		switch (a) {
		case 400:
			error = HTTP.BADREQUEST;
			break;
		case 401:
			error = HTTP.UNAUTHORIZED;
			break;
		case 402:
			error = HTTP.PAYMENTREQUIRED;
			break;
		case 403:
			error = HTTP.FORBIDDEN;
			break;
		case 404:
			error = HTTP.NOTFOUND;
			break;
		case 405:
			error = HTTP.METHODNOTALLOWED;
			break;
			default: 
				error = HTTP.NOTGOODERRORNUMBER;
				break;
		}
		System.out.println(error);
	}
}
