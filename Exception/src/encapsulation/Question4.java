package encapsulation;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.print("Enter name: ");
            String name = sc.nextLine();

           
            System.out.print("Enter age: ");
            String ageInput = sc.nextLine();

            int age;

            
            try {
                age = Integer.parseInt(ageInput);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Age must be a valid integer.");
            }

            
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be between 18 and 59.");
            }

           
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Validation successful!");

        } catch (InvalidAgeException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

