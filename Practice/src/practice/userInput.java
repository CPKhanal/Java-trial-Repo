package practice;
import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		
		
Scanner scan = new Scanner(System.in);
System.out.print("What's your name? ");
String input = scan.nextLine(); 
System.out.println("Hello "+input);
}
}