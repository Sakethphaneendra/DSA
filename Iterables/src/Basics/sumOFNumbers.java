package Basics;
import java.util.Scanner;
public class sumOFNumbers {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Sum Starts from Start to End : Enter Start & End : ");
int N = in.nextInt();
int N2 = in.nextInt();

System.out.println((N2*(N2+1)/2 - N*(N+1)/2 )+ N);
	}

}
