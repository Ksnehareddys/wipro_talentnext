package ClassesAndObjects;

import java.util.Scanner;

class Box
{
	int width;
	int height;
	int depth;
	Box(int x,int y,int z)
	{
		this.width=x;
		this.height=y;
		this.depth=z;
	}
	static int Display(int x,int y,int z)
	{
		int volume=x*y*z;
		return volume;
	}
}

public class Question1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int result=Box.Display(x,y,z);
		System.out.println("Volume of box is: " +result);
		

	}

}
