package java_fundamentals;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.trim().split("\\ss");
		if(str.length==1 && str[0].isEmpty())
		{
			System.out.println("No Values");
		}
		else
		{
			for(int i=0;i<str.length;i++)
			{
			  System.out.print(str[i]);
			
			if(i<str.length-1)
			{
				System.out.print(",");
			}
		}
	}
	}
}
