package assignment5_ForLoop;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		
	//Write a program for the following logic:
	//Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
	//if end = 10, OUTPUT = 1, 3, 5, 7, 9
	//if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

	//You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.
			
		Scanner end = new Scanner(System.in);
		
		System.out.print("Enter end number:");
		
		int num;
		
		for (int i = 1; i < num; i++) {
	
			if (i % 2 != 0) {
				
				System.out.print(i+", ");
			
			}
		}
    }
}