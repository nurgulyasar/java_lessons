package assignment5_ForLoop;

public class Question14 {

	public static void main(String[] args) {
		

	//Write nested loop to draw this pattern

	//##
	//#  #
	//#   #
	//#    #
	//#     #
	//#      #
	//#        #

		for(int i=1;i<8;i++) {
			
			System.out.print("#");
			
			for(int k=2;k<=i;k++){
				System.out.print(" ");
				
			}for(int j=i; j>=i;j--){ 
				System.out.print("#");
	
		    }
			
		System.out.println();
		}
		
		}
}
