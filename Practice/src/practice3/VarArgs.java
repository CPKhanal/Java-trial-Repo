package practice3;

public class VarArgs {
	/*static int sum(int a,int b) {
	return a+b;	
	}
	static int sum(int a,int b,int c) {
		return a+b+c;	
	}*/
	
	static int sum(int ...arr) {
		//Available as int [] arr;
		int result = 0;
		for(int a : arr) {
			result+=a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to VarArgs Tutorial");
		
		System.out.println("The sum of 4 and 5 is: "+sum(4,5));
		System.out.println("The sum of 4, 5 and 6 is: "+sum(4,5,6));
		
		
	}

}
