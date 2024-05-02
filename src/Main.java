import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Class Math - > contains methods for performing basic numeric operations

		double x = 3.14;
		double y = -10;
		double q = 25;

		// Displays the Larger number
		double l = Math.max(x, y);
		System.out.println(l);
		// Displays the smaller number
		double s = Math.min(x, y);
		System.out.println(s);

		// Displays the absolute value of a number
		// Absolute value is the distance from zero that a number is on the number line
		double a = Math.abs(y);
		System.out.println(a);
		
		
		// method Returns the square root of a number 
		double sq = Math.sqrt(q);
		System.out.println(sq);
		
		
		//Method to round the value 
		double round = Math.round(x);
		System.out.println(round);
		
		//method to round up the value
		double celling = Math.ceil(x);
		System.out.println(celling);
		//method to round down the number  
		double floor = Math.floor(x);
		System.out.println(floor);
		
		
		//PROJECT Calculate the Hypotenuse
		double sideA, sideB, sideC;
		
		
		//Scanner class to get user input 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter sideA: ");
		
		sideA = scanner.nextDouble();
		
		System.out.println("Enter sideB: ");
		sideB = scanner.nextDouble();
		
		sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
		System.out.println("The Hypotenuse is : " + sideC);
		
		scanner.close();
		
		
		

	}

}
