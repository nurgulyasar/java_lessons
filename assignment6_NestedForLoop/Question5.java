package assignment6_NestedForLoop;

public class Question5 {

	public static void main(String[] args) {
		
		//Write a Java program to print the following pattern

		//1111111
		//1111122
		//1111333
		//1114444
		//1155555
		//1666666
		//7777777
		
		int rows=7;
		
		for (int i = 1; i <= rows; i++) {
            
			for (int j = 1; j <= rows-i; j++) {
                
				System.out.print(1);
            }
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
             
            System.out.println();
        }
	}

}
