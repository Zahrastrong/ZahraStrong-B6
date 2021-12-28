package HwDay8;

public class CozaLozaWoza {
	public static void main(String[] args) {
		
		// for loop
		
		for(int i = 1; i <= 36 ; i ++ ) {
			
			if ((i % 3== 0) && (i % 5== 0)) 
				System.out.println("CozaLoza");
			else if ( i % 3==0 )
				System.out.println("Coza");
			else if (i % 5==0)
				System.out.println("Loza");
			else if (i % 7 ==0 )
				System.out.println("Woza");
			else 
				System.out.println(i);
		}
			System.out.println("*********");
			
			
			// while loop 
			
			int k = 1;
					
			while(k <= 36) {
				 
				if( k % 3 == 0 && k % 5== 0)
					System.out.println("Cozaloza");
				else if ( k % 3==0 )
					System.out.println("Coza");
				else if (k % 5==0)
					System.out.println("Loza");
				else if (k % 7 ==0 )
					System.out.println("Woza");
				else 
					System.out.println(k);
				k++;
			} 
			System.out.println("*************");
			
			// do while
			
			int t = 1;
			 
			do { 
					 if( t % 3 == 0 && t % 5== 0)
						System.out.println("Cozaloza");
					else if ( t % 3==0 )
						System.out.println("Coza");
					else if (t % 5==0)
						System.out.println("Loza");
					else if (t % 7 ==0 )
						System.out.println("Woza");
					else 
						System.out.println(t);
					t++;
			}while (t <= 36);
			
				
			}
			
			
			}
			
			
	

	
	
		
		
	


