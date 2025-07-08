package ClassesAndObjects;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		String str="";
		String result="";
		for(int i=s.length()-n;i<s.length();i++)
		{
			str+=s.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			result+=str;
		}
		System.out.println(result);

	}

}
