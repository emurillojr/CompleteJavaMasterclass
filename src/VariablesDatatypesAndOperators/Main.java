package VariablesDatatypesAndOperators;

public class Main {

	public static void main(String[] args) {
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result); // 3

		int previousResult = result; // 3

		result = result - 1; // 2
		System.out.println(previousResult + " - 1 = " + result); // 3 - 1 = 2

		previousResult = result; // 2

		result = result * 10; // 20
		System.out.println(previousResult + " * 10 = " + result); // 2 * 10 = 20

		previousResult = result; // 20

		result = result / 5; // 4
		System.out.println(previousResult + " / 5 = " + result); // 20 / 5 = 4

		previousResult = result; // 4
		result = result % 3;  // 1
		System.out.println(previousResult + " % 3 = " + result); // 4 % 3 = 1

		previousResult = result; // 1
		result = result + 1; // 2
		System.out.println("Result is now " + result); // 2
		result++;
		System.out.println("Result is now " + result); // 3
		result--;
		System.out.println("Result is now " + result); // 2

		result += 2;
		System.out.println("Result is now " + result); // 4
		result *= 10;
		System.out.println("Result is now " + result); // 40
		result -= 10;
		System.out.println("Result is now " + result); // 30
		result /= 10;
		System.out.println("Result is now " + result); // 3

		boolean isAlien = false;
		if (isAlien == true)
			System.out.println("It is not an alien!");

		int topScore = 82;
		if (topScore < 100)
			System.out.println("You got the high score!");

		int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if((topScore >90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");
        
	}

}
