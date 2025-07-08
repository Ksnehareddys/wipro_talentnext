package ClassesAndObjects;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		String str="";
		String result="";
		for(int i=0;i<2;i++)
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
