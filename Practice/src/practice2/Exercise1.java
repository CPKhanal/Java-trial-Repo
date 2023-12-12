package practice2;

import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		System.out.println("Calculating the percentage of five subjects by using user Input");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of first subject:");
		double a = sc.nextDouble();
		System.out.println("Enter the marks of second subject:");
		double b = sc.nextDouble();
		System.out.println("Enter the marks of third subject:");
		double c = sc.nextDouble();
		System.out.println("Enter the marks of fourth subject:");
		double d = sc.nextDouble();
		System.out.println("Enter the marks of fifth subject:");
		double e = sc.nextDouble();
		
		double total = a + b + c + d + e;
		System.out.println("Your total marks is " + total);
		double percentage= (total/500)*100;
		System.out.println("Your total percentage is " + percentage);
		
	}

}
