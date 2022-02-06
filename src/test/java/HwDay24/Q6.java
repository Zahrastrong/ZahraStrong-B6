package HwDay24;

public class Q6 {
	public static void main(String[] args) {
		
		int [] n1 = {6,1,2,3};
		int [] n2 = {13,2,3,4,6,1,2,3};
		int [] n3 = {3,3,0,1,4,3,6};
		int [] n4 = {2,6,2};
		int [] n5 = {1,2,3,4,5};
		
		boolean result1 = checkNum( n1);
		boolean result2 = checkNum( n2);
		boolean result3 = checkNum( n3);
		boolean result4 = checkNum( n4);
		boolean result5 = checkNum( n5);
			
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}
	
	
	protected static boolean checkNum(int [] number) {
		boolean result = false;
		
		int twoCount = 0;
		int fiveCount = 0;
		
		for (int i = 0 ; i < number.length ; i++ ) {
			if (number[i] == 2 ) {
			 twoCount ++;
			
			}else if(number[i] == 5) {
				fiveCount ++;
		}
			
		if( twoCount == 2 || fiveCount == 2) {
			result = true;
		}
		}
		return result;
		
	}


	}


