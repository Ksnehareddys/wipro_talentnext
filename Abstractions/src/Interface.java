import java.util.Scanner;

interface Test
{
	int MyFunction(int a,int b, int c);
}
public class Interface {
 public static void main(String[] args) 
 {
	 Test t1=(a,b,c) ->a+b+c;
	 Test t2=(a,b,c) ->a*b*c;
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int sum=t1.MyFunction(a,b,c);
	int product=t2.MyFunction(a,b, c);
	System.out.println("Sum of three numbers is:"+sum);
	System.out.println("Product of three numbers is:"+product);
	
}
}
