import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random rand;
		for (int i = 0; i < 10; i++) {
			rand = new Random();
		list.add(rand.nextInt(30));
		}
		System.out.println(list);
		List<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 5) {
				newList.add(i);
			}
		}
		System.out.println(newList);
		
		
		for(int i = 0;i<list.size();i++) {
			if(list.get(i)>20) {
				list.remove(i);
				i--;
			}
				
		}
		System.out.println(list);
		list.add(2, 1);
		list.add(8,-3);
		list.add(5, -4);
		for(int i = 0;i<list.size();i++) {
			System.out.println("Position"+" "+i +" "+ list.get(i));
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
