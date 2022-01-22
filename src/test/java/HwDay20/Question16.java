package HwDay20;

public class Question16 {
	public static void main(String[] args) {
		
		Question16 obj = new Question16();
		
		String result1 = obj.concatString ("Java", "awesome"); 
		String result2 = obj.concatString ("food", "door"); 
		String result3 = obj.concatString ("java", "training"); 
		String result4 = obj.concatString ("Pro", "ogress");
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

	
	
	
	String concatString (String strOne, String strTwo) {
		 String result = "";
		 
		 String newstr= strOne.concat(strTwo);
		 
		 result = newstr;
		
		 return result;
		 
		 
	}
}
