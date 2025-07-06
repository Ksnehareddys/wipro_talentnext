package arrays;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] newArray = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				newArray[count] = arr[i];
				count++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				newArray[count] = arr[i];
				count++;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(newArray[i] + " ");
		}
	}

}
