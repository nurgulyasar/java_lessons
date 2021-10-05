package assignment5_ForLoop;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {

	//Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
	
		int n, firstTerm = 0, secondTerm = 1;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Fibonacci series of terms:");
		
		n = input.nextInt();		
		
		for (int i = 1; i <= n; ++i) {
		
			 System.out.print(firstTerm + ", ");
			   
			 int nextTerm = firstTerm + secondTerm;
			   
			 firstTerm = secondTerm;
			   
			 secondTerm = nextTerm;
		}
			  
	}
	
}