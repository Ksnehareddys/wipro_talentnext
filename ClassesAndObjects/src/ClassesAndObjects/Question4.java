package ClassesAndObjects;

class Animal
{
	public void eat()
	{
		System.out.println("Animals can eat.");
	}
	public void sleep()
	{
		System.out.println("Animals can sleep.");
	}
}
class Bird extends Animal
{
	public void fly()
	{
		System.out.println("Birds can fly.");
	}
	public void eat()
	{
		System.out.println("Birds can eat.");
	}
	public void sleep()
	{
		System.out.println("Birds can sleep.");
	}
}
public class Question4 {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.fly();
		b.eat();
		b.sleep();

	}

}
