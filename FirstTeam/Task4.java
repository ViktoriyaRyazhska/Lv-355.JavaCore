package first.team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*4.	Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)*/
public class Task4 {
	
	public void task4Do() throws IOException{
	String myString;
	int n=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Input string");		
	myString = br.readLine();
	String myString1=myString.toLowerCase();
	 char [] arr = myString1.toCharArray();
	  for(char c: arr){
          	if ((c=='a')||(c=='o')|| (c=='i')|| (c=='y')||(c=='u')||(c=='e')){
				n++;
			}
		}	
	System.out.println("Text: "+ myString+" has "+ n +" loud letters");			
		
	}
}
