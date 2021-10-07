package assignment5_ForLoop;

import java.util.*;

public class Question04 {

	public static void main(String[] args) {
		
	//Write a while loop that lets the user enter a number. 
	//The number should be multiplied by 10, and the result stored in the variable product. 
	//The loop should iterate as long as product contains a value less than 100.

		int number;

		int product = 0;

		while( product < 100) {

			Scanner input = new Scanner(System.in);
				
			System.out.print("Enter a number:");
			
			number = input.nextInt();

			product = product+(number * 10);

			System.out.println("The result of product="+product);

			input.close();	
		}
	
	
	}

}
