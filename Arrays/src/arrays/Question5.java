package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int s1=arr[0];
	int s2=arr[1];
	int l1=arr[n-1];
	int l2=arr[n-2];
	System.out.println("Smallest two numbers in array is :"+s1+","+s2);
	System.out.println("Largest two numbers in array is :"+l1+","+l2);
	}

}
