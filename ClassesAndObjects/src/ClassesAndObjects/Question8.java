package ClassesAndObjects;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String reverse="";
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   reverse+=s.charAt(i);
	   }
	   
	   if(s.equals(reverse))
	   {
		   System.out.println("Palindrome");
	   }
	   else
	   {
		   System.out.println("Not a Palindrome");
	   }
	}

}
