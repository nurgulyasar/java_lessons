package assignment5_ForLoop;

public class Question02 {

	public static void main(String[] args) {

	//Write a program that displays all odd numbers between 3-130 in the same line
		
		int n = 130;

		for (int i = 3; i <= n; i++) {
			
		   if (i % 2 != 0) {
			   
			System.out.print(i + " ");
		   }
		
		}
	
	}
	
}
