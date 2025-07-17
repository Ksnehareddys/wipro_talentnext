package automobile;

import java.util.Scanner;

public class Compartment {
    double height;
    double width;
    double breadth;

    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
    }
    public class CompartmentTest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            Compartment cm = new Compartment(x, y, z);
            cm.display();
        }
    }
}
