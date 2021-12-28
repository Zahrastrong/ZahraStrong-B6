package HwDay8;

public class Hurricane {
	
	public static void main(String [] args) {
		
		 // for loop 
		
		for(int u = 20; u <= 200; u++) 
			 
			if (u >=74 && u <= 95 ) 
				System.out.println(" Hurricane category 1 wind speed" + u);
			else if (u >= 105 && u <= 110)
		      System.out.println(" Hurricane category 2 wind speed" + u);
			else if ( u >= 120 && u <= 130)
				System.out.println(" Hurricane category 3 wind speed" + u);
			else if (u >= 140 && u <= 155)
				System.out.println(" Hurricane category 4 wind speed" + u);
			else if ( u >= 165 && u <= 194)
				System.out.println(" Hurricane category 5 wind speed" + u);
		
		
		   System.out.println("**************");
		   
		   // while loop 
		   
		   int k = 20;
		   
		   while( k <= 200) {
			   if (k >=74 && k <= 95 ) 
					System.out.println(" Hurricane category 1 wind speed" + k);
				else if (k >= 105 && k <= 110)
			      System.out.println(" Hurricane category 2 wind speed" + k);
				else if ( k >= 120 && k <= 130)
					System.out.println(" Hurricane category 3 wind speed" + k);
				else if (k >= 140 && k <= 155)
					System.out.println(" Hurricane category 4 wind speed" + k);
				else if ( k >= 165 && k <= 194)
					System.out.println(" Hurricane category 5 wind speed" + k);
			   k++; 
		   }
			   
		   System.out.println("****************");
		   
		   // do while loop 
		   
		    int p = 20;
		    
		    do { 
		      if (p >=74 && p <= 95 ) 
				System.out.println(" Hurricane category 1 wind speed" + p);
			else if (p >= 105 && p <= 110)
		      System.out.println(" Hurricane category 2 wind speed" + p);
			else if ( p >= 120 && p <= 130)
			System.out.println(" Hurricane category 3 wind speed" + p);
			else if (p >= 140 && p <= 155)
				System.out.println(" Hurricane category 4 wind speed" + p);
			else if ( p >= 165 && p <= 194)
				System.out.println(" Hurricane category 5 wind speed" + p);
				  p++; 
		    } while ( p <= 200);
		    
	}
		    	
		   
			   
			   
			   
			   
			   
			   
		   }
		
		
		
		



