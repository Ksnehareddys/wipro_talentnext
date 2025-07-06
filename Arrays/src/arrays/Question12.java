package arrays;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[m];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int[] result=new int[2];
		result[0]=arr[n/2];
		result[1]=arr1[m/2];
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}

	}

}
