package ClassesAndObjects;
import java.util.*;
public class Question20 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];

		System.out.print("Enter a string for names[0] (or leave blank): ");
		String input = sc.nextLine();

		if (!input.isEmpty()) {
			names[0] = input;
		} else {
			names[0] = null;
		}

		Optional<String> optionalName = Optional.ofNullable(names[0]);

		int length = optionalName.map(String::length).orElse(0);
		System.out.println("Length of names[0]: " + length);

	}

}
