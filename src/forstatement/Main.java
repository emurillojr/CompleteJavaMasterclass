package forstatement;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create a for statement using any range of numbers Determine if the number is
		 * a prime number using the isPrime method if it is a prime number, print it out
		 * AND increment a count of the number of prime numbers found if that count is 3
		 * exit the for loop hint: Use the break; statement to exit
		 */

		int count = 0;

		for (int i = 10; i < 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("Number " + i + " is a prime number");
				if (count == 10) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}

	}

	public static boolean isPrime(int n) {

		if (n == 1) {
			return false;
		}

		/*
		 * start at 2 - prime number needs to be greater than 1 using n/2 as shortcut to
		 * find numbers that divide into n so no number that is greater than n divided
		 * by 2 is going to divide into n By diving it by 2 - make sure not actually
		 * processing numbers we don't need to process
		 */
		for (int i = 2; i <= n / 2; i++) {
			// for (int i = 2; i <= (long) Math.sqrt(n); i++) { // faster
			//System.out.println("Looping " + i);
			/*
			 * if remainder = 0, found another number that divides evenly into the number
			 * that was passed, can't be prime
			 */
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}

}
