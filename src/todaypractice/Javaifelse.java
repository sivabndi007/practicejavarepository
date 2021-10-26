package todaypractice;

public class Javaifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using if statement
		
		int x = 30; //testing variables
		int y = 25;
		
		if(x > y) {
}
	System.out.println("30 is greater than 25");
	
	if(20 > 18) {
	}
		
		System.out.println("20 is greater than 18");
		
		//using else statement
		
		int time = 30;
		if(time<20) {
			System.out.println("Good evening");
		}else {
			System.out.println("Good day");
		}
		
		//else if statement 
		
		int time2 = 30;
		
		if(time<20) {
			System.out.println("Good day");
		}else if (time<10) {
			System.out.println("Good morning");
		}else {
			System.out.println("Good evening");
		
		}
		
		//Short hand if else (Ternary operation}
		int time3 = 20; 
		String result = (time3 < 18) ? "Good day ":"Good evening";
		System.out.println(result);
	}
		
	}
	

	


