package HwDay20;

public class Question15 {

	public static void main(String[] args) {
		
		String result1 = removeSpace ("       Java Training            "); 
		String result2 = removeSpace ("        I      like   to    practice          ") ;
		
		System.out.println(result1);
		System.out.println(result2);
	}
	
	
	
	
	public static String removeSpace(String strOne){
		
		String result = "";
		
		
		String newstr = strOne.trim();
		result = newstr;
		
		
		
		return result;
		
		
		
		
	}
}



