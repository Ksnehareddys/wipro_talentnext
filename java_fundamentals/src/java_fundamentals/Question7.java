package java_fundamentals;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	char ch2=sc.next().charAt(0);
	if((int)ch<(int)ch2)
	{
		System.out.println(ch+" "+ch2);
	}
	else
	{
		System.out.println(ch2+" "+ch);
	}
	}

}
