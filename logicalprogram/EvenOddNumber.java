package logicalprogram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// num/2 rem-->0-->even
		// System.out.println(10%2);//0
		// System.out.println(10/2);//5
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a%2==0)
		{
		System.out.println("Given number is Even number");
		}
		else {
		System.out.println("Given number is Odd number");
		
	
		}
		
	}

}
