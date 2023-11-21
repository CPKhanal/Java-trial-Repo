package firstproject;

/*
 * Author: Stanley Pieda
 * Date: Sept 30, 2020
 * Description: Demonstration of how to compare floating type numbers.
 * Taken after:
 *    Cay Horstmann. 2019. Big Java Early Objects: Section 5.2.2 Comparing 
 *    Floating-Point Numbers. 7th Ed. Wiley. Chapter 5 pp. 139.
 */
public class FloatingComparisonDemo {
	public static void main(String[] args) {
		// rounding error
		double num = 0.1 + 0.1 + 0.1; 
		
		//num is 0.30000000000000004
		System.out.println("num is: " + num); 
		
		// direct comparison fails
		System.out.println( num == 0.3 ); // false.
		
		// common to set EPSILON to 10 raised to power of -14
		final double EPSILON = 1E-14; 
		
		// this comparison is true.
		System.out.println( Math.abs(num - 0.3) <= EPSILON ); // true
	}
}
