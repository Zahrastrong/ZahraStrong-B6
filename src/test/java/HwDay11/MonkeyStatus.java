package HwDay11;

public class MonkeyStatus {
	
	public static void main(String[] args) {
		
		boolean areWeInTrouble= monkeyTrouble(false, false);
		
		System.out.println(areWeInTrouble);
		
		
	}
	

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		
		boolean result = false;
		
		if ( aSmile && bSmile ) {
			result = true;
		}else if ( aSmile == false && bSmile == false) {
			result = true;
		}else
			result = false;
		
		
			return result;
			
		}
		
		
		


	

}