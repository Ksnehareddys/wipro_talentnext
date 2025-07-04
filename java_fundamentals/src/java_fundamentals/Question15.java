package java_fundamentals;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

