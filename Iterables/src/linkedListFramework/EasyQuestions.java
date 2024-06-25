package linkedListFramework;
import java.util.*;
public class EasyQuestions {

	public static void main(String[] args) {
		/* Easy Level
1.Create and Print a LinkedList: Write a Java program to create a LinkedList of 
integers. Add five integer numbers to the list and then print each number using a 
for-each loop.

2.Add and Remove Elements: Write a Java program to create a LinkedList of strings.
 Add three country names to the list. Remove the second country from the list and 
 print the updated list.

3.Check if Element Exists: Write a Java program to create a LinkedList of characters. 
Add five different characters to the list. Check if the list contains the character 'A'
 and print a message indicating whether it is present or not.

4.Reverse a LinkedList: Write a Java program to create a LinkedList of strings. Add at
 least five string elements to the list. Reverse the order of elements in the list and 
 then print the reversed list.

5.Iterate Backwards: Write a Java program to create a LinkedList of integers. Add some
 integer numbers to the list. Iterate through the list backwards (from last to first 
 element) and print each element. 
 
		*/
		//Remove(Insertion());
		Check(12);
	}
	
	public static LinkedList<Integer> Insertion() {
		LinkedList<Integer> LL = new LinkedList<>();
		LL.add(120);
		LL.add(43);
		LL.add(64);
		LL.add(23);
		LL.add(32);
		for(Integer Element : LL) {
			System.out.println(Element);
		}
		return LL;
	}
	public static void Check(int element){
		LinkedList<Integer> LL = new LinkedList<>();
		LL.add(12);
		LL.add(15);
		LL.add(34);
		LL.add(56);
		LL.add(23);
		LL.addFirst(17);
		System.out.println(LL);
		if(LL.contains(element)) {
			System.out.println("Element Found at Index " + LL.indexOf(element));
		}
		
		for(int i=LL.size()-1;i>=0;i--) {
		System.out.println(LL.get(i));	
		}
		for(int i=0,j=LL.size()-1;i<LL.size()/2;i++,j--) {
//			Swap 
			int dum = LL.get(i);
			LL.set(i,LL.get(j));  
			LL.set(j,dum);
		}
		
		System.out.println("Reversed LinkedList : "+LL);

	}
	public static void Remove(LinkedList<Integer> LL2) {
		System.out.println(LL2);
		System.out.println(LL2.contains(23) + " " + LL2.indexOf(23));

	}

}
