package practice2;

public class Break_And_Continue {
	public static void main(String[] args) {
		// break in FOR loop
		 /*for(int i=0; i<10; i++) {
			System.out.println(i);
			System.out.println("Java is great");
			
			if (i==2) {
				System.out.println("Ending the loop");
				break;
			}
		}
		System.out.println("Loop ends here"); */
		
		
		
		//break in WHILE loop
		/*int i=0;
		while(i<10) {
			System.out.println(i);
            System.out.println("Java is great");
			
			if (i==2) {
				System.out.println("Ending the loop");
				break;
			}
			i++;
			
		} */
		
		
		//Break in DO WHILE loop
		/*int i=0;
		do {
			System.out.println(i);
            System.out.println("Java is great");
			
			if (i==2) {
				System.out.println("Ending the loop");
				break;
			}
			i++;
		   }
		while(i<5);
		System.out.println("Loop ends here");  */
		
			
	
		
		
		// Continue in FOR loop
		
	/*	for(int i=0; i<10; i++) {
						
			if (i==2) {
				System.out.println("Ending the loop");
				continue;
			}
			System.out.println(i);
			System.out.println("Java is great");

		} */
		
		// Continue in DO WHILE loop
		
		int i=0;
		do {
			i++;
			
			if (i==2) {
				System.out.println("Ending the loop");
				continue;
			}
			
			System.out.println(i);
            System.out.println("Java is great");
		   }
		while(i<5);
		System.out.println("Loop ends here");  
		
		
		
		
		
	}

}
