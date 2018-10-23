package myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyBigCollection {
	public void fillingRand() {

		List<Integer> myCollection = new ArrayList<Integer>();
		Random rand;
		rand = new Random();
		for (int i = 0; i < 10; i++) {
			myCollection.add(i, rand.nextInt(30));
			System.out.print(myCollection.get(i) + " ");
		}

		List<Integer> newCollection = new ArrayList<Integer>();
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(i);

			}
		}
		System.out.println();
		for (int i : newCollection) {
			System.out.print(i + " ");
		}
		
		for (int i=0; i<myCollection.size();i++) {
			
		//for (int i : myCollection) {
			if (myCollection.get(i) > 20) {
				myCollection.remove (i);
				i--;
			}
		}
			System.out.println();
			for (int i : myCollection) {
				System.out.print(i + " ");
			}
			if (myCollection.size()>1){myCollection.set(1, 1);}
			if (myCollection.size()>7) {myCollection.set(7, -3);};
			if (myCollection.size()>4) {myCollection.set(4,-4);};
			
			System.out.println();
		for (int i=0; i<myCollection.size();i++) {
				System.out.println("position – "+i+", value of element – "+myCollection.get(i));
			}
		
		Collections.sort(myCollection);
		System.out.println();
		for (int i : myCollection) {
			System.out.print(i + " ");
		}
		}
	}


/*
 * Declare collection myCollection of 10 integers and fill it (from the console
 * or random). Find and save in list newCollection all positions of element more
 * than 5 in the collection. Print newCollection Remove from collection
 * myCollection elements, which are greater then 20. Print result Insert
 * elements 1, -3, -4 in positions 2, 8, 5. Print result in the format:
 * “position – xxx, value of element – xxx” Sort and print collection
 */
