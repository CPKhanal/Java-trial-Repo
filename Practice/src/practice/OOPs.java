package practice;

class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("Writing something");
	}
	public void printColor() {
		System.out.println(this.color);
	}	
}

class Student{
	String name;
	int age;
	public void printInfo() {
	System.out.println(this.name);
	System.out.println(this.age);	
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
}

public class OOPs {
	public static void main(String[] args) {
	
		/*Pen pen1 = new Pen();
		pen1.color = "Blue";
		pen1.type = "gel";
//		pen1.write();
		
		Pen pen2 = new Pen();
		pen2.color = "Black";
		pen2.type = "ballpoint";
		
		pen1.printColor();
		pen2.printColor();*/
		
		Student s1 = new Student("Aman",24);
//		s1.name="Aman";
//		s1.age=24;
		
		s1.printInfo();

	}
}
