package ClassesAndObjects;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String result="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				count=i;
			}
		}
			if(count!=0)
			{
				if(count>0)
				{
					result+=s.substring(0,count-1);
				}
				if(count+2<s.length())
				{
					result+=s.substring(count+2);
				}
				System.out.print(result);
			}
		
			else {
			System.out.println(s);
			
			
		}

	}

}
