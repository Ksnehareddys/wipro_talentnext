package WrapperClasses;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1 && n<=255)
		{
			String s=Integer.toBinaryString(n);
			String result=String.format("%8s", s).replace(' ','0');
			System.out.println(result);
		}
		else
		{
			System.out.println("Enter value in range between 1 to 255");
		}
	}

}
