
public class Task12 {

	public static void start() {
			 
		int s = 0;
		    for( int i=0; i<1000; i++) {
		    	if(i%3==0 || i%5==0) {
		    		s=s+i;
		    	}
		       

	}
		    System.out.println("Sum of elements below 1000 is:" + s);
}
}
