package ClassesAndObjects;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	    String s1=sc.next();
		String result="";
		int max=Math.max(s.length(),s1.length());
		for(int i=0;i<max;i++)
		{
			if (i < s.length()) {
                result += s.charAt(i);
            }
            if (i < s1.length()) {
                result += s1.charAt(i);
            }
		}
	
		System.out.println(result);

	}

}
