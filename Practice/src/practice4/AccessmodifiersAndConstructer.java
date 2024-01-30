package practice4;

class myEmployee{
	 private int id;
	 private String name;

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
public class AccessmodifiersAndConstructer {
	public static void main(String[] args) {
		myEmployee myep = new myEmployee();
		/*myep.id=22;
		myep.name="CP";
		System.out.println(myep.id);
		System.out.println(myep.name);*/
		
		myep.setName("CP Khanal");
		System.out.println(myep.getName());
		
		myep.setId(21);
		System.out.println(myep.getId());
		
	}

}
