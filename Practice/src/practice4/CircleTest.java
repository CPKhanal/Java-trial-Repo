package practice4;

class circle{
	private double radius;
	// Setter method for radius
	public void setRadius(double r) {
		radius =r;
	}
	// Getter method for radius
	public double getRadius() {
		return radius;
	}
	// Method to calculate the area of the circle
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	// Method to calculate the perimeter (circumference) of the circle
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	
}

public class CircleTest {
	public static void main(String[] args) {
		circle cir = new circle();
		cir.setRadius(7);
		
		System.out.println("The area of circle is "+cir.calculateArea() );
		System.out.println("The perimeter of circle is "+cir.calculatePerimeter() );
		
	}

}
