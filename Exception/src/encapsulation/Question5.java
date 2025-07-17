package encapsulation;
import java.util.Scanner;


class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}


class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}


public class Question5 {
    
    
    public static int validateMark(String input) throws NumberFormatException, NegativeValueException, OutOfRangeException {
        int mark = Integer.parseInt(input); 

        if (mark < 0) {
            throw new NegativeValueException("Marks cannot be negative.");
        } else if (mark > 100) {
            throw new OutOfRangeException("Marks must be between 0 and 100.");
        }

        return mark;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_STUDENTS = 2;

        for (int i = 1; i <= TOTAL_STUDENTS; i++) {
            System.out.println("Enter name of student " + i + ":");
            String name = sc.nextLine();

            int[] marks = new int[3];
            boolean valid = true;

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter mark for subject " + (j + 1) + ": ");
                String input = sc.nextLine();

                try {
                    marks[j] = validateMark(input);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid integer.");
                    valid = false;
                    break;
                } catch (NegativeValueException | OutOfRangeException e) {
                    System.out.println("Error: " + e.getMessage());
                    valid = false;
                    break;
                }
            }

            if (valid) {
                int total = marks[0] + marks[1] + marks[2];
                double average = total / 3.0;
                System.out.println("Average marks of " + name + " = " + average);
            } else {
                System.out.println("Could not calculate average for " + name + " due to invalid input.\n");
            }

            System.out.println("----------------------------------------");
        }

        sc.close();
    }
}
