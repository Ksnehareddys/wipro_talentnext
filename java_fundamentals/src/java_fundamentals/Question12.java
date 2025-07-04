package java_fundamentals;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().toUpperCase().charAt(0);
		switch(ch)
		{
		case 'R':
			System.out.println(ch+"-> Red");
			break;
		case 'B':
			System.out.println(ch+"-> Blue");
			break;
		case 'Y':
			System.out.println(ch+"-> Yellow");
			break;
		case 'O':
			System.out.println(ch+"-> Orange");
			break;
		case 'W':
			System.out.println(ch+"-> White");
			break;
		default:
		System.out.println("Invalid code");
		}

	}

}
