package week02;

public class LiveClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean work = false; // Declare our variable and instantiate
		int age = 14;
		int licenseAge = 16;
		boolean license = false;
		
		// Conditionals must be either a boolean or a boolean operation
		
		if(work) { // Conditional. If work is true, codeblock runs
		System.out.println("Bj wants to go to work tomorrow");
		} else {
		System.out.println("Bj definitely does not want to work tomorrow");;
		}
		
		if(age >= licenseAge) { // Boolean Expression.
			license = true;
		}
		else {
			license = false;
			int difference = licenseAge - age;
			
			System.out.println("You've got " + Integer.toString(difference) + " years left until you get your lisence.");
			
		
		switch(age) {
			case 16:
				license = true;
				System.out.println("You are number is 545. Currently serving number 4.");
				
		default:
			System.out.println("Gimme a real age grandpa."); //Runs if all other cases are false
		

		while(license) { // while something is true loop
			System.out.println("Did you get it yet?");
		
		while (!license) { // while license is not true
			System.out.println("you did not receive it");
			
		// do-while
		do {
			System.out.println("did you get it yet?");
		}
			while (!license); //checks condition after running once
	
		}
			
		}
	}

	}
}
}


