package linkedListFramework;
import java.util.*;
public class MediumQuestions {

	public static void main(String[] args) {
		/*
		 Medium Level
1. Merge Two LinkedLists: Write a Java program to create two LinkedList of integers. 
Add five integers to each list. Merge the two lists into a single LinkedList and then 
print the merged list.

2. Sort a LinkedList: Write a Java program to create a LinkedList of integers. Add at 
least ten random integers to the list. Sort the list in ascending order using a sorting
 algorithm of your choice (e.g., bubble sort, merge sort) and print the sorted list.

3. Remove Duplicates: Write a Java program to create a LinkedList of strings with 
duplicate elements. Remove all duplicates from the list and print the updated list 
without duplicates.

4. Swap Nodes: Write a Java program to create a LinkedList of integers. Swap the nodes
at the given two indices in the list. Print the list before and after swapping.

5. Find Middle Element: Write a Java program to find and print the middle element of a
 LinkedList of integers. If the list has an even number of elements, print the second 
 middle element.
		  
		 */
		LinkedList<Integer> Dum = Merge();
		Sort(Dum);
	}
	
	public static LinkedList<Integer> Merge() {
		LinkedList<Integer> OddNumber = new LinkedList<>();
		OddNumber.add(1);
		OddNumber.add(3);
		OddNumber.add(5);
		OddNumber.add(7);
		OddNumber.add(9);
		
		LinkedList<Integer> EvenNumber = new LinkedList<>();
		EvenNumber.add(2);
		EvenNumber.add(4);
		EvenNumber.add(6);
		EvenNumber.add(8);
		EvenNumber.add(10);
		
		System.out.println("Even Numbers : " + EvenNumber +"\nOdd Numbers  : " + OddNumber);

		EvenNumber.addAll(OddNumber);
		System.out.println(EvenNumber);
		return EvenNumber;
	}
	
	public static void Sort(LinkedList<Integer> LL) {
		for(int i=0; i<LL.size();i++) {
			for(int j=i;j<LL.size();j++) {
				if(LL.get(i)>LL.get(j)) {
					int dum = LL.get(i);
					LL.set(i, LL.get(j));
					LL.set(j,dum);
				}
			}
		}
		System.out.println(LL);
	}
}
