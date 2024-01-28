package practice4;


//Problem1 class
class Employee1{    // This is class
	int salary;
	String name;
	
	public int getSalary() {  // This is a method
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}	
}

//Problem2 class
class cellPhone{
	public void ringing() {
		System.out.println("Ringing.....");
	}
	public void vibrating() {
		System.out.println("Vibrating.....");
	}
}

//Problem3 class
class square{
	int side;
	
	public int area() {
		return side*side;
	}
	public int perimeter() {
		return 4*side;
	}
}

//Problem5 class
class Tommy{
	public void hit() {
		System.out.println("Hitting the Enemy...");
	}
	public void run() {
		System.out.println("Running from Enemy...");
	}
	public void fire() {
		System.out.println("Firing the enemy...");
	}
}

public class Exercise8 {
	public static void main(String[] args) {
		
		//Problem1
		/*Employee1 em = new Employee1();
		em.setName("CP Khanal");
		em.salary = 20;
		System.out.println(em.getName());
		System.out.println(em.salary); */
		
		//Problem2
		/*cellPhone redmi =new cellPhone();
		redmi.ringing();
		redmi.vibrating();*/
		
		//Problem3
		/*square sq = new square();
		sq.side=3;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());*/
		
		//Problem5 
		Tommy player1 = new Tommy();
		player1.fire();
		player1.run();
		player1.hit();
		
		
	}

}
