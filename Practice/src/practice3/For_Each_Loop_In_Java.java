package practice3;

public class For_Each_Loop_In_Java {
	public static void main(String[] args) {
		
		int [] marks = { 100, 90, 80, 70, 60};

		//double [] marks = { 100, 90.5, 80, 70, 60};
		//System.out.println(marks[1]);
		//System.out.println(marks.length);
		
		//Displaying the array using loop
		/* for (int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//displaying elements of array in reverse order
		for (int i=marks.length - 1; i >= 0; i--) {
			System.out.println(marks[i]);
		} */
		
		// Using simple method to display all elements of array
		for (int element: marks) {
			System.out.println(element);
		}

	}

}
