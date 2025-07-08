package ClassesAndObjects;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()%2==0)
		{
			String FirstHalf=s.substring(0,s.length()/2);
			System.out.println("Firsthalf is "+FirstHalf);
		}
		else
		{
			System.out.println("Null");
		}

	}

}
