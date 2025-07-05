package java_fundamentals;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int original=n;
		int rev=0;
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
      if(original==rev)
      {
    	  System.out.println(rev+" is palindrome.");
      }
      else
      {
    	  System.out.println(rev+" is not a palindrome.");
      }

	}

}
