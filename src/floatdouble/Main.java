package floatdouble;

public class Main {
	
	public static void main(String[] args) {
		// Convert a given number of pounds to kilograms
		// 1. Create a variable to store the number of pounds
		// 2. Calculate the number of Kilograms for the number above and store in a variable.
		// 3. Print out the result.
		// NOTES: 1 pound is equal to 0.45359237 kilograms.
	
		double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms); // 90.7185
        
	}
	
}
