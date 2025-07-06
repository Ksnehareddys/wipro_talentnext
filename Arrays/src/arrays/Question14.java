package arrays;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int[][] arr=new int[m][n];
		 int max = Integer.MIN_VALUE;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
					arr[i][j]=sc.nextInt();
					
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
		}
		System.out.print("The largest number is:"+max);
	}

}
