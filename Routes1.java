// CPSC 331 Assignment1 Question 3 Solution
// By: Katie Knauss, Osama Bamatraf, and Jeremy Rupprecht 
//
// Problem: This is an algorithm that solves the "Route Counting" problem in Assignment1
// for CPSC331, specifically answering question 3
//
// Precondition: A pair of nonnegative integers, n and m, are given as input
// Postcondition: The value Routes(n,m) (as defined in the assignment) is returned as output
//
// The main method of this program will check whether two integer inputs have actually
// been received. If this is not the case then it will display an error message and
// terminate. Otherwise it will call the method count(n,m), and then print out
// the correct value Routes(n,m) 
//
// The only material that was used to create this program 
// was the question specifications, and a google search 
// trying to figure out what the BigInteger data type is 
// and how to properly use it, which is cited below:
//
// https://stackoverflow.com/questions/46802421/how-do-i-create-a-new-biginteger-variable-and-make-a-method-that-returns-a-bigin
//

package cpsc331.assignment1;
import java.math.BigInteger;

public class Routes1 {

	public static void main(String[] args) {
		

		BigInteger finalValue;

		
		try {
		
		if (args.length != 2) {
			System.out.println("Sorry! You must provide exactly two nonnegative integers as input");
			System.exit(0);

		} else {

			int n = Integer.parseInt(args[0]);
			int m = Integer.parseInt(args[1]);

			finalValue = count(n, m);
			
			System.out.println(finalValue);  

			//Assertion: exactly 2 nonnegative integers have been provided as input
			//1. argument 0 is n, argument 1 is m, both 
			//   are inputted as arguments into count
			//2. the final value Routes(n,m), has been outputeed into
			//   finalValue and has been printed to console

		}

		}catch (NumberFormatException nfe) {
			System.out.println("Sorry! You must provide exactly two nonnegative integers as input");
		}	

                        //Assertion: the user did not provide the correct input arguments
                        //1. An appropriate error message has been printed
                        //   to the console
}

	BigInteger finalValue;

        public static BigInteger count(int n, int m) {
		
                if ((n < 0) || (m < 0)) {

                        System.out.println("Sorry! You must provide exactly two nonnegative integers as input");
                        throw new IllegalArgumentException("Sorry! You must provide exactly two nonnegative integers as input");  
			
			//Assertion: n or m are values that are less than 0
			//1. An appropriate error message has been printed
			//   to the console
			//2. An IllegalArgumentException has been thrown
	
                }else if ((n == 0) || (m == 0)) {
			
			return BigInteger.ONE;

			//Assertion:
			//1. n or m are integer inputs such that either one is 
			//equal to 0
			//2. The integer 1 has been returned as output
			
                } else {

                        return count(n-1,m).add(count(n,m-1));

			//Assertion:
			//1. n and m are integr inputs such that both are greater
			//   than or equal to 0
			//2. a recursive call is made to return the final Value Routes(n,m), which is done by
			//   calling count with a decremented n value and regular m value, and calling count with a 
			//   decremented m value, with a regular n value, and adding them up
                }

        }



}
