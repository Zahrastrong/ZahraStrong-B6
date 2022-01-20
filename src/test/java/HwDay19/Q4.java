package HwDay19;

public class Q4 {
// static method
	public static void main(String[] args) {
		// make an object to call non static
		Q4 obj = new Q4();

		String resultOne = obj.toUpper("Pro");
		String resultTwo = obj.toUpper("java");
		String resultThree = obj.toUpper("java training");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		

	}

// non static method 
	String toUpper(String strOne) {

		String result = "";

		String newstr = strOne.toUpperCase();
	result = newstr;

		return result;

	}

}
/**
 * Write a method that takes one String parameter and the method converts the
 * parameter to uppercase and return the new String value
 */