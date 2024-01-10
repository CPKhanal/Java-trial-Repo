package practice3;

public class MethodOverloading {
	
	static void foo() {
		System.out.println("Good morning bro!");
	}
	static void foo(int a) {
		System.out.println("Good morning "+ a +" bro!");
	}
	static void foo(int a, int b) {
		System.out.println("Good morning "+ a +" bro!");
		System.out.println("Good morning "+ b +" bro!");
	}

	
	static void change(int a) {
		a = 98;
	}

	static void change2(int[] arr) {
		arr[0] = 98;
	}

	static void tellJoke(){
		System.out.println("I invented new word: \n" + "Plagiarism");
	}
	// Main Method 
	public static void main(String[] args) {
	  //tellJoke();
		
	    // Case 1: Changing the integer
		//int x =45;
		//change(x);
		//System.out.println("The value of x after running x is: " + x);
		
		// Case 2: Changing the Array
		//int [] marks = {52,65, 77, 78,90};
		//change2(marks);
		//System.out.println("The marks after running change2 function  is: " + marks[0]);
		

		// Method Overloading starts here
		
		foo();
		foo(5);
		foo(55,65); //arguments are actual!
		
		
	}
}
