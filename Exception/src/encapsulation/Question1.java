package encapsulation;

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			int size = sc.nextInt();

			int[] arr = new int[size];

			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}

			int index = sc.nextInt();

			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("java.lang.NumberFormatException");
		}

	}

}
