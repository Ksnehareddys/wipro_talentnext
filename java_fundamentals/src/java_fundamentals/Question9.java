package java_fundamentals;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		int age=sc.nextInt();
		if((s.equals("female")||s.equals("male")))
		{
			if((s.equals("female")) && (age>=1 && age<=58))
			{
				System.out.println("The percentage of interest is 8.2%.");
			}
			else if((s.equals("female")) && (age>=59 && age<=100))
		    {
				System.out.println("The percentage of interest is 9.2%.");
			}
			else if((s.equals("male")) && (age>=1 && age<=58))
			{
				System.out.println("The percentage of interest is 8.2%.");
			}
			else
			{
				System.out.println("The percentage of interest is 10.5%.");
			}
		}

	}

}
