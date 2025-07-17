package encapsulation;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new ArithmeticException("Number of elements must be greater than 0.");
            }

            int[] numbers = new int[n];
            int sum = 0;

            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }

            int average = sum / n;

            System.out.println("Sum of elements: " + sum);
            System.out.println("Average of elements: " + average);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integers.");
        } 
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
