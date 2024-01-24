package practice3;

public class Exercise7 {
	//Problem 1 Method
	static void multiplication(int n) {
		for(int i=1;i<=10;i++) {
			System.out.format("%d x %d = %d \n",n,i,n*i);
		}
	}
	//Problem 2 method
	static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Problem 3 method
	static int sumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n + sumRec(n-1);
	}
	//Problem 4 method
	static void pattern2(int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Problem 5 method
	static int fib(int n) {
		if (n==1) {
			return 0;
		}
		else if (n==2) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	//Problem 8 method
	static void pattern1Rec(int n) {	
		if (n>0) {
			pattern1Rec(n-1);
			for (int i=0;i<n;i++) {
				System.out.print("x");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		//Problem 1
		//multiplication(7);
		
		//Problem 2
		//pattern1(4);
		
		//Problem 3
		//System.out.println(sumRec(4));
		
		//Problem 4
		//pattern2(4);
		
		//Problem 5
		//fib series: 0,1,1,2,3,5,8,13,21,34,...
		//System.out.println(fib(10));
		
		//Problem 8
		pattern1Rec(4);
		
	}

}
