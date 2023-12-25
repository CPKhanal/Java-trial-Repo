package practice2;

public class Exercise5 {
	public static void main(String[] args) {
		
		// Problem 1  Prints the star pattern
		 /*int n=4;
		for (int i=n; i>0; i--) {
			for (int j=0; j<i; j++) {
			
			System.out.print("*");
			}
			System.out.print("\n");
		} */
		
		// Problem 2  Sum of even numbers
		 /*int sum = 0;
		int n = 4;
		for (int i=0; i<n; i++) {
			sum = sum + (2*i);
		}
		System.out.println(sum);*/
		
		//Problem 3  Multiplication table of 5
		/*int n =5;
		for (int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d \n",n,i,n*i);
			
		}*/
		
		// Problem 4 Multiplication table of 10 in reverse order
		/*int n=10;
		for (int i=10;i>0;i--) {
			System.out.printf("%d * %d =%d \n",n,i,n*i);
		}*/
		
		
		//Problem 5     Factorial of number by using for loop
		/* int n = 5;
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact * i;	
		}
		System.out.println(fact); */
		
		
		
		// Problem 6     Factorial of number using while loop
		 /*int n = 5;
		int i = 1;
		int fact = 1;
		while (i<=n) {
			fact *= i;
			i++;	
		}
		System.out.println(fact);  */
		
		// Problem 7  Star pattern using while loop
		
		/*int n = 4;
		int i = n;

		while (i > 0) {
		    int j = 0;
		    while (j < i) {
		        System.out.print("*");
		        j++;
		    }
		    System.out.print("\n");
		    i--;
		} */

		//Problem 9
		 /*int n =8;
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += n*i;
			
		}
		System.out.println(sum); */
		
		
		//Problem 11 
		 int sum = 0;
		int n = 4;
		int i = 0;

		while (i < n) {
		    sum = sum + (2 * i);
		    i++;
		}

		System.out.println(sum); 

		
	}

}
