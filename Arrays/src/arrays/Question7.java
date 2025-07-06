package arrays;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}

		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i]+" ");
		}
	}
}
