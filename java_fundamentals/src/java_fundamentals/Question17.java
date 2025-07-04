package java_fundamentals;

public class Question17 {

	public static void main(String[] args) {
		for (int num = 11; num < 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num+" ");
            }
        }

	}

}
