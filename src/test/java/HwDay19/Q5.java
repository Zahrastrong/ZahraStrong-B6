package HwDay19;

public class Q5 {
	
	public static void main(String[] args) {
		
		Q5 obj= new Q5();
		
		String resultOne= obj.toLower("espn");
		System.out.println(resultOne);
		String resultTwo= obj.toLower ("SOCCER");
		System.out.println(resultTwo);
		String resultThree= obj.toLower ("STRING CLASS");
		System.out.println(resultThree);
	
	}
	
	protected String toLower(String strOne) {
		String result = "";
		
		String newstr = strOne.toLowerCase();
		result = newstr;
		
		
		return result;
		
	}

}

/**5. Write a method that takes one String parameter and the method converts the
parameter to lowercase and return the new String value
*/