package assignmentOnArray;

public class Ouestion1 {

		public static void main(String[] args) {
			
			int[] nums1000 = new int[100];
			
			for(int i=0, p=1; i<100; i++) {
				for(int j=0; j<10; j++) {
					nums1000[i] = p;
					System.out.print(p + "\t");
					p++;
					
				}
				System.out.println();
		}		
			 
	}
	
}
