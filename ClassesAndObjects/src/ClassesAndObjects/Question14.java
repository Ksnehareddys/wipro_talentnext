package ClassesAndObjects;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String str="";
		if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x')
		{
			str=s.substring(1,s.length()-1);
			System.out.println(str);
		}
		else if(s.charAt(0)=='x')
		{
			str=s.substring(1,s.length());
			System.out.println(str);
		}
		else if(s.charAt(s.length()-1)=='x')
		{
			str=s.substring(0,s.length()-1);
			System.out.println(str);

		}
		else
		{
			System.out.println(s);
		}

	}

}
