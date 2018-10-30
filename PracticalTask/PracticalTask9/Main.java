
public class Main {
public static void main(String [] args) {
	try {
		Plant pl = new Plant(3,"red","rose");
		
	System.out.println(pl);	
	}
		catch (ColorException | TypeException e) {
		      System.err.println(e.getMessage() + "\n");
		      
		   }
		}}

