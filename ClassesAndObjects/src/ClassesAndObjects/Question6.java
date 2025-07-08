package ClassesAndObjects;

import java.util.Scanner;

class Fruit
{
	String name;
	String taste;
	String size;
	Fruit(String name, String taste,String size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("The name of fruit is: " +name+ " and taste of the fruit is " +taste);
	}
}
class Apple extends Fruit
{
	Apple(String name,String taste,String size)
	{
		super(name,taste,size);
	}
	void eat()
	{
		System.out.println("The apple is " +taste+ " in taste.");
	}
}
class Orange extends Fruit
{
	Orange(String name,String taste,String size)
	{
		super(name,taste,size);
	}
	void eat()
	{
		System.out.println("The Orange is " +taste+ " in taste.");
	}
}
public class Question6 {

	public static void main(String[] args) {
		Apple a=new Apple("Apple","sweet","medium");
		a.eat();
		Orange o=new Orange("Orange","Sour","meadium");
		o.eat();
	}

}
