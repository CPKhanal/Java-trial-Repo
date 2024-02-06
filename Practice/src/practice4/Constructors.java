package practice4;

class MyMainEmployee{
	 private int id;
	 private String name;

	 public MyMainEmployee() { //Constructers
		 id = 45;
		 name = "Your-Name-Here";
	 } 
	 
	 public MyMainEmployee(String myName, int myId) { //Constructers Overloading
		 id = myId;
		 name = myName;
		 
	 }
	 
	 public String getName(){
		 return name;
	 }
	 public void setName(String n){
		 this.name = n;
	 }
	 public void setId(int i) {
		 this.id = i;
	 }
	 public int getId() {
		 return id;
	 }
}

public class Constructors {
	public static void main(String[] args) {
		//MyMainEmployee mymep = new MyMainEmployee("The Boss",66);
		MyMainEmployee mymep = new MyMainEmployee();
		//mymep.setName("CP Khanal The Boss");
		//mymep.setId(99);
		System.out.println(mymep.getName());
		System.out.println(mymep.getId());
		
		
		
	}
}
