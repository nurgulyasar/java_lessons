package assignment5_ForLoop;

public class Question13 {

	public static void main(String[] args) {
		
	//Print following chessboard using nested for loops.
	//W B W B W B W B
	//B W B W B W B W
	//W B W B W B W B
	//B W B W B W B W
	//W B W B W B W B
	//B W B W B W B W
	//W B W B W B W B
	//B W B W B W B W

	//NOTE:
	//1. Total 8 rows and 8 columns.
	//2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.
    
   for (int i = 1; i <= 8; i++) {
        
       if(i%2 == 0)
       {
            
           for (int j = 1; j <= 4; j++)
           {
               System.out.print("B W ");
                
           }
           
       }else{
            
           for (int j = 1; j <= 4; j++){
               
        	   System.out.print("W B ");
           }     
               
       }
        
       System.out.println();
   		
   	   }
    }
}