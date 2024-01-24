package firstproject;

/*
 * Author: Stanley Pieda
 * Date: Sept 30, 2020
 * Description: Demonstration of how to compare Strings with .equals(String), and
 *              why we do not compare Strings using ==
 */

import java.util.Scanner;

public class CompareStringsDemo {

	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			String value1 = "tuna fish";
			String value2 = "tuna fish";
			
			System.out.println("Please enter \"tuna fish\" without the quotes and press enter");
			String value3 = keyboard.nextLine(); // enter "tuna fish" (without the quotes)
			
			System.out.println(value1 == value2); // same reference so true
			System.out.println(value1 == value3); // different references so false
			System.out.println(value1.equals(value2)); // true, same contents
			System.out.println(value1.equals(value3)); // true, assuming user entered "tuna fish"
		}

	}

}
