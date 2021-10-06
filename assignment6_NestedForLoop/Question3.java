package assignment6_NestedForLoop;

public class Question3 {

	public static void main(String[] args) {
		
	//Write a Java program to print the following pattern

	//	1 2 3 4 5 6 7
	//	 2 3 4 5 6 7
	//	  3 4 5 6 7
	//	   4 5 6 7
	//	    5 6 7
	//	     6 7
	//	      7
	//	     6 7
	//	    5 6 7
	//	   4 5 6 7
	//	  3 4 5 6 7
	//	 2 3 4 5 6 7
	//	1 2 3 4 5 6 7
		
	int rows=7;
	
	for (int i = 1; i <= rows; i++) {
	            
	    for (int j = 1; j < i; j++) {
	                
	    System.out.print(" ");
	    
	    } 
	    
	    for (int j = i; j <= rows; j++) { 
	                System.out.print(j+" "); 
	    }          
	System.out.println(); 
	   
	} 
	         
	for (int i = rows-1; i >= 1; i--) {
	            
	    for (int j = 1; j < i; j++) {
	                
	    System.out.print(" ");
	     
	    }
	             
	    for (int j = i; j <= rows; j++){
	                
	    System.out.print(j+" ");
	            
	    }
	             
	 System.out.println();
	 }

}

}
