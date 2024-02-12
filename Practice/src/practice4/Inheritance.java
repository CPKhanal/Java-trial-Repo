package practice4;

class Base{
	int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("I am in Base and now I'm Setting X now");
		this.x = x;
	}

	/*public void printMe() {
		System.out.println("I am a constructor");
	}*/
}
class Derived extends Base{
	int y;
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("I am in derived and now I'm Setting Y now");
		this.y = y;
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		
		//Creating an object of base class
		Base b = new Base();
		b.setX(4);
		System.out.println(b.getX());
		
		//Creating an object derived class
		Derived d = new Derived();
		d.setY(5);
		System.out.println(d.getY());
	}
}
