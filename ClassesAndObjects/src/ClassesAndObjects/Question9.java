package ClassesAndObjects;

import java.util.Scanner;

public class Question9
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		String s1=sc.next().toLowerCase();
		String result;
		s=s.replaceAll("[^a-z]", "");
		s1=s1.replaceAll("[^a-z]", "");
		if(s.charAt(s.length()-1)==s1.charAt(0))
		{
			result=s+s1.substring(1);
		}
		else
		{
			result=s+" "+s1;
		}
		System.out.print(result);
	}

}
