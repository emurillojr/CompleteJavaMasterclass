package switchstatement;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create a new switch statement using char instead of int create a new char
		 * variable create a switch statement testing for A, B, C, D, or E display a
		 * message if any of these are found and then break Add a default which displays
		 * a message saying not found
		 */
		char charValue = 'G';
		switch (charValue) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found");
			break;
		case 'C':
		case 'D':
		case 'E':
			System.out.println(charValue + " was found");
			break;

		default:
			System.out.println("Could not find A, B, C, D or E");
			break;
		}

		String month = "JuNE";
		switch (month.toUpperCase()) {
		case "JANUARY":
			System.out.println("Jan");
			break;
		case "JUNE":
			System.out.println("Jun");
			break;
		default:
			System.out.println("Not sure");
		}
	}
}
