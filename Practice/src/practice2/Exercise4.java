package practice2;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		
		// Problem 1
		/*  int a = 10;
		if ( a == 11) {
			System.out.println("This is 11");
		}
		else {
			System.out.println("This is not 11");
		}   */
		
		
		
		
		//Problem 2
		
		/* Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your marks for Maths");
		byte m = sc.nextByte();
		
		System.out.println("Enter your marks for Physics");
		byte p = sc.nextByte();
		
		System.out.println("Enter your marks for Chemistry");
		byte c = sc.nextByte();
		
		double avg = (m+p+c)/3;
		System.out.println("Yout overall percentage is" + avg);
		
		if(avg >= 40 && m >= 33 && p >= 33 && c >= 33) {
			System.out.println("You are passed");
		}
		else {
			System.out.println("You have been failed");
		} */
		
		
		
		// Problem 3
      /*  Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your Income:");
		float income = sc.nextFloat();
		
		float tax = 0;
		if(income<=2.5) {
			tax = tax + 0;
		}
		else if ( income > 2.5f && income <= 5f) {
			tax = tax + 0.05f *(income - 2.5f);
		}
		
		
		else if ( income > 5f && income <= 10f) {
			tax = 0.05f * (5f - 2.5f) + 0.2f * (income - 5f);
		}
		
		else if ( income > 10f) {
			
			tax = 0.05f * (5f - 2.5f) + 0.2f * (10f - 5f) + 0.30f * (income - 10f);
		
		}
	      System.out.println("The total tax paid is: "+tax);	
	*/
		
		
		// Problem 4
		
      /*  Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		
		int day = sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
				break;
		case 6:
			System.out.println("Friday");
				break;
		case 7:
			System.out.println("Saturday");
				break;
		default:
			System.out.println("enter number between 1 to 7");
					
		} */
		
		
		//Problem 6
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the website URL:");
		String website = sc.next();
	
		if(website.endsWith(".org")) {
			System.out.println("Organizational website");
		}
		else if (website.endsWith(".com")) {
			System.out.println("Commercial website");
		}
		else if (website.endsWith(".np")) {
			System.out.println("Nepalese website");
		}
		

		
		
				
	}
}
