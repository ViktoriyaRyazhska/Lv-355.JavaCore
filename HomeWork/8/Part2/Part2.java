package HomeWork8;

public class Part2 {

	public static void main(String[] args) {
		
		String s1 = "I  am  learning  Java   Core";
		
		String s2 = s1.trim().replaceAll (" +", " ");
		
		StringBuffer s3 = new StringBuffer(s2);

		s3.replace(1,3, "`");
		
		System.out.println(s3);
	}
}
