package practice;

class Student2{
	String name;
	int age;
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name,int age) {
		System.out.println(name +" "+ age);
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		
		Student2 s2 = new Student2();
		s2.name ="Aman";
		s2.age =24;
		s2.printInfo(s2.name,s2.age);
	}
}
