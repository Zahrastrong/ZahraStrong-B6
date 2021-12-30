package HwDay8;

public class Question4 {

	public static void main(String [] args)  {
		
		// for loop
		
		int totalOdd = 0;
		int totalEven = 0;
		
		
		for( int number = 1; number <= 20; number ++) {
		
			 if ( number % 2 == 0 ) {
				 
				  totalEven = totalEven + number ;
				
			 } else {
				 totalOdd = totalOdd + number;
			 }
		}
				 System.out.println(" odd # :" + totalOdd);
				 System.out.println(" even # ; " + totalEven);
				 
				 System.out.println ("********************");
				 
				 
				 // while loop 
				totalOdd = 0;
				totalEven = 0;
			int num = 1;
			
			while ( num <= 20) {
				
				if (num % 2 == 0  ) {
					totalEven = totalEven + num;
				} else { 
					totalOdd = totalOdd + num;
				}
					num++;
			}
				 System.out.println(" odd # :" + totalOdd);
				 System.out.println(" even # ; " + totalEven);
				 System.out.println ("****************************");
					
				 // do while loop 
				 
				 totalOdd = 0;
				 totalEven = 0;
				 
				 int n = 1;
				 
				 do { 
					 if( n %2 == 0) {
						 totalEven = totalEven + n;
					 } else { 
						 totalOdd = totalOdd + n;
						 
					 } n ++; 
					 
				 } while( n <= 20);
				 
				 System.out.println(" odd # :" + totalOdd);
				 System.out.println(" even # ; " + totalEven);
				
				 
				}
			
} 
				 
			
		
			 
		
			 
		
	
	
		
