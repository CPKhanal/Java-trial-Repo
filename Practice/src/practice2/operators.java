package practice2;

public class operators {
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("This is for logical AND");
		if(a && b) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		System.out.println("This is for logical OR");
		if(a || b) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		System.out.println("Not(a) is "+ !a);
		System.out.println("Not(b) is "+ !b);
		
	}

}
