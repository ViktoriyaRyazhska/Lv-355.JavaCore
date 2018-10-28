package HomeWork8;

public class Part1 {

	public static void main(String[] args) {

		String s1 = "Hello Hold Name Something Drink";

		String[] arr = s1.split(" ");
		String rts = "";

		StringBuffer sb = new StringBuffer(arr[1]);
		sb.reverse();
		System.out.println("Reverse: " + sb);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() >= rts.length()) {
				rts = arr[i];
			}
		}
		System.out.println("The longest world: " + rts);
		System.out.println("Number of letter: " + rts.length());

	}
}
