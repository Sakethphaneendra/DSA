package Basics;

import java.util.Scanner;

public class GOAT {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.print("Enter A & B : ");
//		int A = in.nextInt();
//		int B = in.nextInt();
		ThreeNumbers();
//		if(A==B) 
//			System.out.println("Both Are Equal");
//		else 
//			System.out.println((A>B)?"A is Greater B is Lesser" : "B is Greater and A is Lesser");
	}
	
	public static void ThreeNumbers(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A & B & C: ");
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
			if(A==B && B==C)
				System.out.println("All are Equal");
			else if(A>B && A>C)
				System.out.println("A is G.O.A.T ");
			else if(B>A && B>C) 
				System.out.println("B is G.O.A.T ");
			else 
				System.out.println("C is G.O.A.T ");

			
	}

}
