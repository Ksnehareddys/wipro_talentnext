package ClassesAndObjects;

class Shape {
	void draw() {
		System.out.println("Drawing shape.");
	}

	void erase() {
		System.out.println("Erasing shape.");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing circle.");
	}

	void erase() {
		System.out.println("Erasing circle.");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing triangle.");
	}

	void erase() {
		System.out.println("Erasing triangle.");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Drawing square.");
	}

	void erase() {
		System.out.println("Erasing square.");
	}
}

public class Question7 {

	public static void main(String[] args) {
		Circle c = new Circle();
		Triangle t = new Triangle();
		Square s = new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
