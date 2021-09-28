package day10_ControlFlowStatements_Part4;

public class task46_MultiplicationTable {

	public static void main(String[] args) {
		
		int num=10;
		
		System.out.println("Multiplication table for "+ num);
		System.out.println("---------------------------");
		
		for(int i=1;i<=10;i++) {
			int multiplication=(num*i);	
			System.out.println(num+"*"+ i +"="+multiplication);
			
		
		}

	}
}