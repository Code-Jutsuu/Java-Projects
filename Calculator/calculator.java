import java.util.*;

public class calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Enter the  value");
		int x =scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter the Opetator '+', '-', '*', '/' ");
		char c = scan.next().charAt(0);
	
		
		System.out.println("Enter the second value");
		int y = scan.nextInt();
		
		 int opp = 0;
		 
		if (c == '+') {
		  opp = x+y;	 
		} else if (c == '-') {
		   opp = x-y;
	   } else  if (c == '*') {
	       opp = x*y;	
	   } else  if (c == '/') {		
	       if (y  == 0) { 
	    	 System.out.println("Error: Cannot divide by zero.");
	    	  return;} 
	    	  
	      else if (c=='/') {
	    		  opp = x/y;
	    		  
	    	 
	      } 
	   	   
	       } if (c == 'x' || c== 'X') {
			System.out.println("You end the Operation");
			
		}
		 
		 
		System.out.println( "Result: " + opp);
		
		
		System.out.println("Enter 'x' or 'X' to exit the Calculator");
		char z = scan.next().charAt(0);
		if (z == 'x' || z == 'X') {
			 System.out.println("You end the operation");
			}
		
		}
   

}
