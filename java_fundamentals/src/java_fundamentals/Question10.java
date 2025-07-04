package java_fundamentals;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			char upper=(char)(ch-32);
			System.out.println("o/p:"+ch+"->"+upper);
		}
		else
		{
			char lower=(char)(ch+32);
			System.out.println("o/p:"+ch+"->"+lower);
		}
	}

}
