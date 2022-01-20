package HwDay19;

public class Q6 {
	public static void main(String[] args) {
		
		String result1 = combineStr ("day", "ONE", "work","HOURS") ;
		String result2 = combineStr ("week", "weekend", "monday","Tuesday") ;
		String result3 = combineStr ("restoN", "vA", "baltiMORE", "MD"); 
		String result4 = combineStr ("java", "is", "fun","LEARNING");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
	
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
	String result = "";
	
	String newstr = strOne.toUpperCase() + strTwo.toLowerCase();
	String newstr2 = strThree.toUpperCase() + strFour.toLowerCase();
	result = (newstr.concat(newstr2));
	
	
	return result;
	
	}	
}
/**Write a method that takes four String parameters, the method
a. converts parameter 1 and parameter 3 to uppercase,
b. converts parameter 2 and parameter 4 to lower case
c. Then the method concatenates all four parameters and return the new String
value.*/