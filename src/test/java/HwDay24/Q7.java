package HwDay24;

public class Q7 {
	public static void main(String[] args) {
		
		int [] n1 = {88,22,6, 1, 2, 3, 88,22,44,33};
		int [] n2 = {1, 2, 3,22,44,33};
		int [] n3 = {88,22,6, 1,8,0};
		int [] n4 = {2, 3, 88,22,44};
		
		
		int result1 = getIndexNumber(n1,3 );
		int result2 = getIndexNumber(n2,12 );
		int result3 = getIndexNumber( n3, 22);
		int result4 = getIndexNumber(n4, 44 );
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

	
	public static int getIndexNumber(int [] number, int elementValue) {
		int result = 0;
		

		for ( int i = 0; i < number.length ; i++ )
			
		if(number[i] == elementValue) {
			result = i;
			break;
			
	
		}else {
			result = -1;
			
		}
		
		return result;
		
		
	}
}
