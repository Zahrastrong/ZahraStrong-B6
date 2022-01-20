package HwDay19;

public class Q7 {
	public static void main(String[] args) {
		
		Q7 obj = new Q7();
		String result1 = obj.helloTo ("Denis") ;
		String result2 = obj.helloTo ("Malek") ;
		String result3 = obj.helloTo ("Sara");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	
	}

	
	 String helloTo(String strOne) {
	
	String result = "";
	
	result = "Hello " + strOne;
	
	
	
	return result;
	
		
	}
	
}
/**Write a method that takes one String parameter (name) and the method returns new
String value appending “Hello” to name parameter*/