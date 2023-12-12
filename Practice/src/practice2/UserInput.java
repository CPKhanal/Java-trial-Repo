package practice2;
import java.util.Scanner;
public class UserInput {
	public static void main (String[] args){
		
		System.out.println("Taking User Input");
		
		 Scanner sc = new Scanner(System.in);
		 
		
		/* 
		  System.out.println("Enter the first number");
		   //int a = sc.nextInt();
		   Float a = sc.nextFloat();
		System.out.println("Enter the second number");
		   //int b = sc.nextInt();
		   float b = sc.nextFloat();
		float sum = a + b;
		System.out.println("The sum of the number is: "+ sum);   
		
		   */
		
		/* 
		boolean b1 = sc.hasNextInt();
		System.out.println(b1);
		*/
		
		String str = sc.next();
		System.out.println(str);
		
	}
	
}
