package todaypractice;

public class Javaforloop {

	public static void main(String[] args) {
		   //Print the numbers from 0 to 4
		for(int i = 0; i<5; i++) {
			System.out.println(i);
	}
		for(int i1 = 5; i1<2; i1++) {
			System.out.println(i1);
		}
		
		//print even values from 0 to 10
		
		for(int a = 0; a<=10;a = a + 2) {
			System.out.println(a);
		}
			//for - each loop
		
		//all elements in the cars array
		String[] cars = {"volvo", "BMW","Ford"};
		for(String i : cars) {
			System.out.println(i);
		}
		//In the loop, when the value is "4", jump directly to the next value.


		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    
			continue;
			  }
			  System.out.println(i);
			}
		}
		}
	

