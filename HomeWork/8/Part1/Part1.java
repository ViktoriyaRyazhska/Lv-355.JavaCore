package HomeWork8;

public class Part1 {

//	public static void reverse(String s1)
	public static void reverse(String [] arr) {
		
		String str = null;
		char[] temparray = arr[1].toCharArray();
//		char[] temparray = s1.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
			str = new String(temparray);
		}
		System.out.print("Reverse: " + str);
		System.out.println();


	}
	public static void main(String[] args) {

		String s1 = "Hello Hold Name Something Drink";

		String[] arr = s1.split(" ");
		String rts = "";

//		StringBuffer sb = new StringBuffer(arr[1]);
//		sb.reverse();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() >= rts.length()) {
				rts = arr[i];
			}
		}
		reverse(arr);
//		reverse("Hold");
		System.out.println("The longest world: " + rts);
		System.out.println("Number of letter: " + rts.length());

	}
}
