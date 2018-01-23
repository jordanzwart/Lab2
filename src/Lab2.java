import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name;
		int numOne;
		String odd;
		String evenLessThan25;
		String even;
		String oddAndOver60;
		char letter;

		letter = 'y';
		odd = "Odd.";
		evenLessThan25 = "Even and less than 25.";
		even = "Even.";
		oddAndOver60 = "Odd and over 60.";

		System.out.println("Hi please enter your name: ");
		name = scan.next();
		System.out.println("Hi " + name + "!");

		//This is the begining loop. This states that if letter is equal to y, it will move to asking for the integer you want to choose.
		while (letter == 'y') {
			System.out.println("Please enter any positive digit between 1 through 100:");
			numOne = scan.nextInt();

		//If the number is bigger than 100 or smaller than 1, it will result in an error and exit the loop. If the number is between 1 and 100 it will move to the else stmt.
			if ((numOne > 100) || (numOne < 1)) {
				System.out.println("Error.");
			} 
			else {
		//If the number is odd it will work through this code.
				while (numOne % 2 == 1) {
					//If the number is odd and greater than 60 it will print "odd and over 60."
					if (numOne > 60) {
						System.out.println(oddAndOver60);
					} 
					//If the number is odd and less than 60 it will print "Odd."
					else if (numOne % 2 == 1) {
						System.out.println(odd);
					}
					//Exits the loop after it runs correct code.
					break;
				}
		//If the number is even it will work through this code.
				while (numOne % 2 == 0) {
					//If the number is between 2 and 25 and even it will print "Even and less than 25."
					if ((numOne >= 2) && (numOne < 25)) {
						System.out.println(evenLessThan25);
					}
					//If the number is between 26 and 60, it will print "Even."
					if ((numOne >= 26) && (numOne <= 60)) {
						System.out.println(even);
					}
					//If the number is even and above 60, it will print "Even."
					if (numOne > 60) {
						System.out.println(even);
					}
					//Exits the loop after it runs correct code.
					break;
				}
			}
		//The code completes and asks if the user wants to try again. If they type "y" it runs the code again, if they type "n" it prints "Goodbye!"
			System.out.println("Do you want to try again? Type: y/n");
			letter = scan.next().charAt(0);
		}
		System.out.println("Goodbye!");
	}
}
