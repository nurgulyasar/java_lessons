package day10_ControlFlowStatements_Part4;

public class forLoop {

	public static void main(String[] args) {
		
		//print 15 times hello
		
		//System.out.println("Hello");//1
		//System.out.println("Hello");//1+1=2
		//System.out.println("Hello");//2+1=3
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
	
		for(int i=0 ; i<=0 ; i++){
			System.out.println("Hello");
		}
		
		// i condition increment(i++_
		
		// 0 TRUE print Hello 1
		
		//   TRUE print Hello 2
		
		//   TRUE print Hello 3
		
		//   TRUE print Hello 4
		
		//   TRUE print Hello 5
		
		//   FALSE
		
		for(int i=5 ; i<5 ; i++){
			System.out.println("Hello");
		}
		
		for(int i=5;i<=10;i++){
			System.out.println(" i= " + i);
			
		}
		for(int num=20;num>=10;num--) {
			System.out.println("num = " + num);
			
		}
		
		for(int i=0; i<=100; i+=10) {
			System.out.println("i="+i);
			
		}
	
		for (int i=50;i>=0;i-=5) {
			System.out.println("i=" + i);
		}
		
	}

}
