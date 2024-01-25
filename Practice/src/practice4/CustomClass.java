package practice4;

class Employee{
	int id;
	String name;
	int salary;
	public void printDetails() {
		System.out.println("My ID is " + id);
		System.out.println("My name is " + name);
		//System.out.println("My salary is " + salary+"$/hr.");
	}
	public int getSalary() {
		return salary;
	}
}

public class CustomClass {
	public static void main(String[] args) {
		System.out.println("This is our custom class !");
		Employee em = new Employee();
		
		em.id = 9;
		em.name = "cp";
		em.salary = 17;
		
		Employee cp = new Employee();
		cp.id = 10;
		cp.name = "cp khanal";
		cp.salary = 16;
		
		em.printDetails();
		cp.printDetails();
		int salary = cp.getSalary();
		System.out.println(salary);
		//System.out.println(em.id);
		//System.out.println(em.name);
		
	}

}
