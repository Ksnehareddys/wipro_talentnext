package encapsulation;

import java.util.Scanner;

class InvalidCountryException extends Exception {

	public InvalidCountryException() {
		super("User Outside India cannot be registered");
	}

	public InvalidCountryException(String message) {
		super(message);
	}
}

public class Question3 {

	void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equalsIgnoreCase("India")) {
			throw new InvalidCountryException("User Outside India cannot be registered");
		} else {
			System.out.println("User registration done successfully");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question3 reg = new Question3();

		System.out.print("Enter username: ");
		String username = sc.nextLine();

		System.out.print("Enter country: ");
		String country = sc.nextLine();

		try {
			reg.registerUser(username, country);
		} catch (InvalidCountryException e) {
			System.out.println(e);
		}

		sc.close();
	}
}
