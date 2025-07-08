package ClassesAndObjects;

import java.util.Scanner;

public class question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    if(s.length()>2)
    {
    	String result=s.substring(1,s.length()-1);
    	System.out.println(result);
    }
    else
    {
    	System.out.println("No");
    }
	}

}
