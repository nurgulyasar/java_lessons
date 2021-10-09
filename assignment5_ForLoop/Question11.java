package assignment5_ForLoop;

public class Question11 {

	public static void main(String[] args) {
	//Print the following output using nested for loops.

	//	4       3       2      1

	//		3       2      1

	//	         2       1

	//	              1

		int n=4;
		
		for (int i = 4; i<n; i--){
			
			for (int j = 1; j <= i ; j++){
				
				System.out.print(" ");
			}
			for (int j= i; j <n; j++){
				
				System.out.print(j + " ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}