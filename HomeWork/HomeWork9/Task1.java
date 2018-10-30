import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		
try {
	System.out.println(div(44,3.434));
}
catch(ArithmeticException e ){
	System.out.println(e.getMessage());
}
	}
	public static double div(double a,double b) {
		double c = a/b;
		if(a==0||b==0) {
			throw new ArithmeticException("one of your numbers is 0");
		}
		return c;
	}

}
