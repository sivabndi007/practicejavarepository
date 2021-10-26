package todaypractice;

public class javastrings {

	public static void main(String[] args) {
		
		String greeting = "Hello";
		System.out.println(greeting);
		
		//the length of a string can be found with the length() method:
		
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("length of the text string is :" + text.length());
		
		//concatenation of strings , use concat()method or use + operator 
		
	    String firstname = "Jhon";
		String lastname = "Doe";
		System.out.println(firstname.concat(lastname));
		
		 String firstName = "John ";
		    String lastName = "Doe";
		    System.out.println(firstName.concat(lastName));
		    
		    String txt = "Please locate where locate occures";
		    System.out.println(txt.indexOf("locate"));
		    
		    String txt1 = "It\'s good";
		    System.out.println(txt1);
		    
		    String txt2 = "Hello siva";
		    System.out.println(txt2);
		    
		    String txt3 = "Hello Pk";
		    System.out.println(txt3.toUpperCase());
		
		
		
		
		
		
	}
 
}
