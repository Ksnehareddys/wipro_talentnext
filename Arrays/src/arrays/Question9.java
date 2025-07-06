package arrays;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int[] result = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 10) {
				result[count] = arr[i];

				count++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
