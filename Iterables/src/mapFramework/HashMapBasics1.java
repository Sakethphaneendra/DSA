package mapFramework;

import java.util.*;

public class HashMapBasics1 {

	public static void main(String[] args) {

		// 1. Basic Operations: Write a Java program to create a HashMap, add some
		// key-value pairs, and print the map.
		
		HashMap<Object, Object> HM = new HashMap<>();
		

		HM.put("Saketh", 15);
		HM.put("Jayasree", 90);
		HM.put("Hema", 80);
		HM.put("SakethFinal", 95);
		System.out.println(HM);
		int h = "JayaSree".hashCode();
				System.out.println(-(h%10));

		System.out.print(HM.containsKey("Jayasree"));

	}

}
