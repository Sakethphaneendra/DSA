package mapFramework;
import java.util.*;
public class wordCounter {

	public static void main(String[] args) {
		/* 	 
1.Write a program to count the frequency of each word 
in a given string and store it in a HashMap.
Example Input: "hello world hello"
Example Output: {hello=2, world=1}
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Some Text : ");
		String Text = (in.nextLine()).trim();
		in.close();
		String word[] = Text.split(" ");
		System.out.println(Arrays.toString(word));
		
		HashMap<Character,String> Count = new HashMap<>();
		
		
		
		
	}

}
