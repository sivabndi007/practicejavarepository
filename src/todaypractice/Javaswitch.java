package todaypractice;

public class Javaswitch {

	public static void main(String[] args) {
		
		//declaring a variable for switch expression
		
		int day = 4;
		
		//switch expression 
		
		switch(day) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		}
		
		int num = 3;
		switch(num) {
		case 1 :
			System.out.println("1");
			break;
		case 2 :
			
			System.out.println("2"); 
			break;
			default:
				System.out.println("Not in the list");
			    }  
		
		//where we are printing month name for the given number
		
		 int month=3;  
		    
		    switch(month){  
		    case 1:
		    	System.out.println("1 - January");
		    break;  
		    case 2:
		    	System.out.println("2 - February");
		    break;  
		    case 3: 
		    	System.out.println("3 - March");
		    break;  
		    case 4: 
		    	System.out.println("4 - April");
		    break;  
		    default:
		    	System.out.println("Invalid Month");  
		    }
		}
	}

				
		