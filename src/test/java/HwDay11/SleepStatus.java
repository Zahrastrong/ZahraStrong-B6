package HwDay11;

public class SleepStatus {
	
	public static void main(String[] args) {
		
		boolean amIsleeping = sleepIn(false, true);
		System.out.println(amIsleeping);
		
		
	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		 
		boolean result = false;
		
		if ( !isWeekday || isVacation) {
			result = true;
			
		}else 
			result = false;
	
		return result;
		
	}
}
