package assignment6_NestedForLoop;

public class Question6 {

	public static void main(String[] args) {
		
	//Write a Java program to print the following pattern

	//	1
	//	2 6
	//	3 7 10
	//	4 8 11 13
	//	5 9 12 14 15
		
	int rows= 5;
	
	for (int i = 1; i <= rows; i++) 
        {
            int num = i;
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num+" ");
                 
                num = num+rows-j;
            }
             
            System.out.println();
        }	
		
		
	}

}
