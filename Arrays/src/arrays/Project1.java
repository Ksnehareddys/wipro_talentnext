package arrays;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] Empno= {1001,1002,1003,1004,1005,1006,1007};
		String[]  EmpName= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		char[] code= {'e','c','k','r','m','e','c'};
	    String[] Department= {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] Basic= {20000,30000,10000,12000,50000,23000,29000};
		int[] HRA= {8000,12000,8000,6000,20000,9000,12000};
		int[] IT= {3000,9000,1000,2000,20000,4400,10000};
		Scanner sc=new Scanner(System.in);
		int searchId=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<Empno.length;i++)
		{
			if(searchId==Empno[i])
			{
				found=true;
				String designation="";
				int da=0;
				switch (code[i])
				{
					case 'e':
						designation="Engineer";
						da=20000;
						break;
					case 'c':
						designation="Consultant";
						da=32000;
						break;
					case 'k':
						designation="Clerk";
						da=12000;
						break;
					case 'r':
						designation="Receptionist";
						da=15000;
					    break;
					case 'm':
						designation="Manager";
						da=40000;
						break;
				}
				int salary=Basic[i]+HRA[i]+da-IT[i];
				System.out.println("EmpNo\tEmp Name\t\tDepartment\tDesignation\t\tSalary");
                System.out.println(Empno[i] + "\t" + EmpName[i] + "\t\t" + Department[i] + "\t\t" + designation + "\t\t" + salary);
                break;
				
			}
		}
		 if (!found) {
	            System.out.println("Employee with EmpNo " + searchId + " not found.");
	        }
		

	}

}
