package HwDay19;

public class Q9 {
	public static void main(String[] args) {
		
		Q9 obj = new Q9();
		
		        boolean result1 = obj.isThere("java training", "ini");
				boolean result2 = obj.isThere ("java training", "ava");
				boolean result3 = obj.isThere ("java training", "AVA");
				boolean result4 = obj.isThere ("java training", "Java");
				
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

	private boolean isThere(String strOne, String value) {
		boolean result = false;
		
		if (strOne.contains(value)) {
			result = true;
		}else { 
			result = false;
			
		}
	
		return result;

	}

}
/**Write a method that takes two String parameters and the method checks if a given
String contains the specified sequence of character values. Return true if it contains the
value otherwise false*/