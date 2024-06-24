package arrayListFramework;
import java.util.ArrayList;
import java.util.Collections;
public class BasicOperations {

	public static void main(String[] args) {
		// Write a Java program to create an ArrayList of integers, 
		// add five integers to it, and then print the list.
		
		ArrayList<Integer> Numbers = new ArrayList<>();
		
		Numbers.add(15);
		Numbers.add(17);
		Numbers.add(12);
		Numbers.add(12);
		Numbers.add(43);
		System.out.println("List : "+ Numbers);
		
//		Element Access: How do you access the third element in an ArrayList? 
//		Write a code snippet to demonstrate this.
		
		System.out.println("Find The Index : " + Numbers.indexOf(12));
		System.out.println("Find The Element at Index : " + Numbers.get(1));	
		System.out.println("Find The Index : " + Numbers.lastIndexOf(null));
		
//		Size of ArrayList 
		
		System.out.println("Size of The List : " + Numbers.size());
		
// Write a Java program to iterate through all elements in an ArrayList using a for-each loop.
		
//		First we need to know type that is int (Primitive Type) in my case so
//		 for(int Number : Numbers) {
//			 System.out.println(Number);
//		 }  // This ForEach Only Works when all elements are Integers no null type
		 for(int i=0;i<Numbers.size();i++) {
			 System.out.println(Numbers.get(i));

		 }
		 
//		 Removing Elements: How do you remove an element from an ArrayList by its index? 
//		 Provide a code example.
		 if(Numbers.contains(null)) {
			 Numbers.remove(Numbers.indexOf(null));
		 }
		 System.out.println(Numbers);

//		 Sorting the List: Write a Java program to sort ArrayList of strings in ascending order.
		 ArrayList<String> Names = new ArrayList<>();
		 Names.add("Saketh");
		 Names.add("JayaSree");
		 Names.add("Hema");
		
		 System.out.println(Names);
		 Collections.sort(Names);
		 System.out.println(Names);
		 
//		 Write a Java program to convert an ArrayList to an array.
		 
		 Numbers.toArray();
		

// Sorting Strings via there ascii code 
		


	}

}
