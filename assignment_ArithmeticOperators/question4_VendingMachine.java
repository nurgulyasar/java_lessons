package assignment_ArithmeticOperators;

import java.util.Scanner;

public class question4_VendingMachine {

	public static void main(String[] args) {
		// 1 Quaters= 25 cents
		// 1 Dimes=10 cents
		// 1 Nickel=5 cents	
				
		Scanner input =new Scanner(System.in);
		int quarters, dimes, nickels, amount, change;
		
		amount=input.nextInt();
		
		System.out.println("Price in cents:"+ amount);
				
		change= 100-amount;
				
		quarters=change/25;
		change=change%25;
						 
		dimes=change/10;
		change=change%10;
						 
		nickels=change/5;
		change=change%5;
						 
		System.out.println("");
				
		System.out.println("Your change is "+ quarters +" quarters, " + dimes + " dimes, and " + nickels + " nickels");
						    
			
			}
		}