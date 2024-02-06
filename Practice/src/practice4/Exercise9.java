package practice4;

//Problem1 Class
class Cylinder{
	private int radius;
	private int height;
	
	public Cylinder(int radius, int height) { //constructor for problem3
		this.radius = radius;
		this.height = height;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}	
	//Problem2 function
	public double surfaceArea() {
		return 2*3.1415*radius*radius + 2*3.1415*radius*height;
	}
	public double volume() {
		return Math.PI*radius*radius*height;
	}
}
//Problem4 Class
class Rectangle {
	private int length;
	private int breadth;
	//Constructors
	public Rectangle() {
		this.length = 4;
		this.breadth = 5;
	}
	//Overloaded constructor
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	//Getters
	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}	
}

//Proble5 class
class Sphere {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double Volume() {
		return 4/3*Math.PI*radius*radius*radius;
	}
	
	public double SurfaceArea() {
		return 4*Math.PI*radius*radius;
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		Cylinder myCylinder = new Cylinder(9, 12);
		
	     /* 
		//Problem1
		myCylinder.setHeight(12);
		int h = myCylinder.getHeight();
		System.out.println(h);
		
		myCylinder.setRadius(9);
		System.out.println(myCylinder.getRadius()); 
		
		
		//Problem2
		System.out.println(myCylinder.surfaceArea());
		System.out.println(myCylinder.volume());
		
	
		//Problem4
		Rectangle r = new Rectangle(12,56);
		
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		 */
		
		//Problem5
		Sphere sp = new Sphere();
		sp.setRadius(7);
		System.out.println(sp.Volume());
		System.out.println(sp.SurfaceArea());
		
	}
}
