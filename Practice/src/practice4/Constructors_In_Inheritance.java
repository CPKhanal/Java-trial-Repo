package practice4;

class Base1{
	public Base1() {
		System.out.println("I am the constructor of Base Class");
	}
	public Base1(int x) {
		System.out.println("I am the Overloaded constructor of Base Class with value "+x);
	}
	
}

class Derived1 extends Base1{
	public Derived1() {
		//super(0);
		System.out.println("I am the constructer of Derived class");
	}
	Derived1( int x,int y){
		super(x);
		System.out.println("I am the Overloaded constructor of Derived Class with value "+y);
	}
}

class ChildOfDerived extends Derived1{
	ChildOfDerived(){
		System.out.println("I am child of derived class");
	}
	ChildOfDerived(int x, int y,int z){
		super(x, y);
		System.out.println("I am child of derived class with  value " +z);
	}
}

public class Constructors_In_Inheritance {
	public static void main(String[] args) {
	
		//Base1 b = new Base1();
		//Derived1 d = new Derived1();
		//Derived1 d = new Derived1(14,9);
		//ChildOfDerived cd = new ChildOfDerived();	
		ChildOfDerived cd = new ChildOfDerived(13,14,15);	
		
	}

}
