package ClassesAndObjects;

import java.util.Scanner;
import java.util.StringJoiner;

public class Question19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringJoiner sj = new StringJoiner("-");
		for (int i = 0; i < n; i++) {
			sj.add(sc.next());
		}
		int m = sc.nextInt();
		StringJoiner sj1 = new StringJoiner("-");
		for (int i = 0; i < m; i++) {
			sj1.add(sc.next());
		}
		StringJoiner m1 = new StringJoiner("-");
		m1.merge(sj);
		m1.merge(sj1);
		System.out.println("sj merged into sj1:"+m1);
		StringJoiner m2 = new StringJoiner("-");
		m2.merge(sj1);
		m2.merge(sj);
		System.out.println("sj merged into sj1:"+m2);
		
	}

}
