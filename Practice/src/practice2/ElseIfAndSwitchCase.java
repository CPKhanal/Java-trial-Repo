package practice2;
import java.util.Scanner;

public class ElseIfAndSwitchCase {
	public static void main(String[] args) {
		
		System.out.println("Enter your age");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		switch(age) {
		    case 18:
			    System.out.println("You are going to be an adult");
			    break;
			
		    case 23:
			    System.out.println("You are going to join a job");	
			    break;
			
		    case 60:
				System.out.println("You are going to retire");	
				break;
				
		    default:
		    	System.out.println("Enjoy your life");
		
		}
		
		
		/*	if (age>56) {
			System.out.println("You are experienced");
		}
		else if(age>46) {
			System.out.println("You are semi experienced");
		}
		else if(age>36) {
			System.out.println("You are semi semi experienced");
		}
		else {
			System.out.println("You are not experienced");
		}   */
		
		
		
		
	
	}

}
