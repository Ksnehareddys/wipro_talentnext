package java_fundamentals;

import java.util.Scanner;

public class Question4a {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   if(n>0)
	   {
		   System.out.println("+ve");
	   }
	   else if(n<0)
	   {
		   System.out.println("-ve");
	   }
	   else
	   {
		   System.out.println("Zero");
	   }

	}

}
