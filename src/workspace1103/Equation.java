package workspace1103;

import java.util.Scanner;

public class Equation {
	/**
	 * Gets user input for the coefficients of the quadratic equations.
	 * Input values can only be in int or double.
	 * @return a list of double values for each coefficient.
	 */
	static double[] getUserInput() {
		double valueA;
		double valueB;
		double valueC;
		
		Scanner A = new Scanner(System.in);
		Scanner B = new Scanner(System.in);
		Scanner C = new Scanner(System.in);
		
		System.out.println("Enter value of 'A': ");
		valueA = A.nextDouble();
		System.out.println("Enter value of 'B': ");
		valueB = B.nextDouble();
		System.out.println("Enter value of 'C': ");
		valueC = C.nextDouble();
		
		return new double[] {valueA, valueB, valueC};
	}
	
	/**
	 * Returns the larger of the two roots of the quadratic equation
	 * A*x*x + B*x + C = 0, provided it has any roots.  If A == 0 or
	 * if the discriminant, B*B - 4*A*C, is negative, then an exception
	 * of type IllegalArgumentException is thrown.
	 */
	static public double root() throws IllegalArgumentException {
		double[] userInput = getUserInput();
		double A = userInput[0];
		double B = userInput[1];
		double C = userInput[2];
		
	    if (A == 0) {
	      throw new IllegalArgumentException("A can't be zero.");
	    }
	    else {
	       double disc = B*B - 4*A*C;
	       if (disc < 0)
	          throw new IllegalArgumentException("Discriminant < zero.");
	       return  (-B + Math.sqrt(disc)) / (2*A);
	    }
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println(root());	
				System.out.println("Would you like to continue? ");
				String userInp = inp.nextLine();
				if ((userInp.toLowerCase()).equals("no")) break;
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				System.out.println();
				System.out.println("Would you like to continue? ");
				String userInp = inp.nextLine();
				if ((userInp.toLowerCase()).equals("no")) break;
			}
		}
	}
}
