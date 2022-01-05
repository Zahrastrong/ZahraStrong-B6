package HwDay11;

public class DoubleTotal {
	
	public static void main(String[]args) {
		
		int myTotal = sumDouble ( 6,6);
		
		 System.out.println(myTotal);
		 

		}

	
	public static int sumDouble(int valueOne, int valueTwo) {
		
		int result = 0;
		
		if( valueOne == valueTwo) {
			result = ((valueOne + valueTwo ) * 2);
			
		}else
			result = (valueOne + valueTwo);
	
		
		return result;
		
	}
}
