package ClassesAndObjects;

import java.util.Scanner;

class Person
{
	String member;
	Person(String member)
	{
		this.member=member;
	}
	public String getMember()
	{
		return member;
	}
	public void setMember(String member)
	{
		this.member=member;
	}
}
class Employee extends Person
{
	double salary;
	int year;
	String insuranceNo;
	Employee(String member,double salary,int year,String insuranceNo)
	{
		super(member);
		this.salary=salary;
		this.year=year;
		this.insuranceNo=insuranceNo;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getYear()
	{
		return year;
	}
	public String getInsuranceNo()
	{
		return insuranceNo;
	}
	public void setSalary()
	{
		this.salary=salary;
	}
	public void setYear()
	{
		this.year=year;
	}
	public void setinsuranceNo()
	{
		this.insuranceNo=insuranceNo;
	}
	
}
public class TestEmployee {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String member=sc.next();
		
		
		double salary=sc.nextDouble();
		int year=sc.nextInt();
		String insuranceNo=sc.next();
		Employee e=new Employee(member,salary,year,insuranceNo);
		System.out.println("Employee details:");
		System.out.println("The name of the person: "+e.getMember());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Year: "+e.getYear());
		System.out.println("InsuranceNo: "+e.getInsuranceNo());

	}

}
