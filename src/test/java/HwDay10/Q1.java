package HwDay10;

public class Q1 {
	
	public static void main(String [] args) {
		
	
			 calculate(4.0, 3.0, '*');
			
}	
	
	
	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
		
		if (mathOperationSign == '+' ) {
			System.out.println( numOne  + " + "  + numTwo + " = " + (numOne+ numTwo) );
		} else if ( mathOperationSign == '-' ) {
			System.out.println(numOne + "-" + numTwo + "=" + (numOne - numTwo ));
		}else if ( mathOperationSign == '/') {
			System.out.println(numOne + "/" + numTwo + "=" + (numOne / numTwo ));
		} else if ( mathOperationSign == '*') { 
			System.out.println( numOne + "*" + numTwo + "=" + (numOne * numTwo ));
		} else if ( mathOperationSign == '%' ) {
			System.out.println ( numOne + "%" + numTwo + "=" + (numOne % numTwo ));
		}else 
			System.out.println(" error");
		
				
			
			
			
		}
		
		
		
	}
	
	

