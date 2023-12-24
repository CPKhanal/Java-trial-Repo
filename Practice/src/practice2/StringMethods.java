package practice2;

public class StringMethods {
	public static void main(String[] args) {
		
		String name = "Chandra Prakash Khanal";
		int value = name.length();
		
		System.out.println(name);
		System.out.println(value);
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		
		String myName = "     CP     ";
		System.out.println(myName.trim()); // trimmer
		
		System.out.println(name.substring(8)); // substring
		System.out.println(name.substring(8,15)); // starting is included but ending is not includes
		System.out.println(name.replace('a', '*'));// replace the old char with new char
		System.out.println(name.startsWith("Chand"));
		System.out.println(name.endsWith("Anal"));
		
		
		System.out.println(name.charAt(16)); // finds the character indexing the string
		System.out.println(name.indexOf("a")); // finds the index of string
		System.out.println(name.indexOf("an",7)); // search for index of "an" from 7th indexing
		System.out.println(name.lastIndexOf("a")); // search index from last
		
		
		System.out.println(name.equals("Chandra prakash khanal"));
		System.out.println(name.equalsIgnoreCase("chandra prakash khanal")); 
		
		//Escape Sequence Characters
		
		System.out.println("I am testing  \n things \n"); // new line
		System.out.println("I am testing \t things "); // tab
		System.out.println("I am testing \"things\" "); // double quote
		System.out.println("I am testing \\ things "); // prints backslash
		
		
		
	}

}
