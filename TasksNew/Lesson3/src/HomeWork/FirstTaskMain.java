package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTaskMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		float num1, num2, num3;
		int num4, num5, num6;
		int httpError;
		Http error;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 float numbers");
num1 = Float.parseFloat(br.readLine());
num2 = Float.parseFloat(br.readLine());
num3 = Float.parseFloat(br.readLine());
if (num1 < 5.0 && num1 > (-5.0)) {
	System.out.println("First number belongs to the range -5 to 5");
}
else {
	System.out.println("First number doesn't belongs to range -5 to 5");
}
if (num2 < 5.0 && num2 > (-5.0)) {
	System.out.println("Second number belongs to the tange -5 to 5");
}
else {
	System.out.println("Second number doesn't belongs to the range -5 to 5");
}
if (num3 < 5.0 && num3 > (-5.0)) {
	System.out.println("Third number belongs to the range -5 to 5");
}
else {
	System.out.println("Third number doesn't belongs to the range -5 to 5");
	}
System.out.println("Enter 3 integer numbers");
num4 = Integer.parseInt(br.readLine());
num5 = Integer.parseInt(br.readLine());
num6 = Integer.parseInt(br.readLine());
if (num4 > num5 && num4>num6) {
	System.out.println("max is " + num4);
}
if (num5>num4 && num5>num6) {
	System.out.println("max is " + num5);
	}
if (num6>num4 && num6>num5) {
	System.out.println("max is " + num6);
}
System.out.println("Enter the number of HTTP Error");
httpError = Integer.parseInt(br.readLine());
switch(httpError) {
case 403:
	System.out.println(Http.FORBIDDEN);
	break;
case 404:
	System.out.println(Http.NOTFOUND);
	break;
case 405:
	System.out.println(Http.METHODNOTALLOWED);
	break;
	case 406:
		System.out.println(Http.NOTACCEPTABLE);
		break;
	case 407:
		System.out.println(Http.REQUESTTIMEOUT);
}
}

	
}
