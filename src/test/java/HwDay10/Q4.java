package HwDay10;

public class Q4 {
	
	public static void main(String [] args ) {
		
       getDoWhileLoopResult( 1, 12);
       
	}

	
	
	public static void getDoWhileLoopResult ( int minNum, int maxNum) {
		
	do { 
		System.out.println(minNum);
		minNum++;
	}while(minNum <= maxNum);
	
		
		
	}
}
