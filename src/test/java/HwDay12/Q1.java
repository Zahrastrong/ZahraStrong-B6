package HwDay12;

public class Q1 {
	
	public static void main(String [] args) {
		
		boolean result1 = posNeg(1, -1, false);
		boolean result2 = posNeg(-1, 1, false);
		boolean result3 = posNeg(-4, -5, true);
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	

	public static boolean posNeg(int n1, int n2, boolean isNegative ) {
		boolean result = false;
		
		
		if((n1 < 0) && (n2>0 )&& (isNegative== false)) {
		result = true;
		}else if ( n1 >0 && n2 <0 && isNegative == false) {
			result = true;
		}else if(n1<0 && n2 <0 && isNegative == true ) {
			result = true;
		}else
			result = false;
		
		return result;
		
	}
	
}
