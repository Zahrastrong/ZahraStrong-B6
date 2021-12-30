package HwDay9;

public class BrokenCodeTwo {
	
	public static void  main(String[] args) { //switch static and void & upper case S 
		
		double tempOne=84.7;  // change int to double 
		 int tempTwo =66;
		
		String result;
		if (tempOne <  0 && tempTwo  > 100) { // no need for both = & only two && is needed & no "" for 100
			result = "true";  // add "" 
		}   else if  (tempOne > 100 && tempTwo < 0) { // delete both = & delete ; & change to else if 
			
			result = "true"; // add ""
		} else {
			result= "false"; // add ""
		}
		
		System.out.println(result); // no s at the end of result 
		
		String season = "Monday";

		switch (season) { // delete =="fall" 
		case "fall" :  // change '' to "" & change ; to :
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 break; // add break
		case "spring": // change to spring inside "" & change ; to :
			System.out.println("Recovering from cold weather");			
			break;
		case "summer":  // change ; to : 
			System.out.println("Toooo hot");			
			 
		default: // change ; to : 
			System.out.println("Season does not exist!");	
		}
		
		
		for(int i = 0 ; i < 10; i++) {  // lower case f for for & Int to lower case i &
			//give value to i & change , to ; & no ; between ) { 
			
			if (i == 5) {  // no space between == & no need for ; & extra )( & add { 

				System.out.println("I equals to 5"); // add ; at the end
			} else { // no need for ()
				System.out.println("i not equals"); // change '' to ""
			}
		}
		
}
// delete two extra }}

	}
	

