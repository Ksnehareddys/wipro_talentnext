package Abstractions;

import java.util.*;

abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment {
	public String notice() {
		return "First compartment";
	}
}

class Ladies extends Compartment {
	public String notice() {
		return "Ladies compartment";
	}
}

class General extends Compartment {
	public String notice() {
		return "General compartment";
	}
}

class Luggage extends Compartment {
	public String notice() {
		return "Lagguage compartment";
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] arr = new Compartment[10];
		FirstClass f = new FirstClass();
		Ladies l = new Ladies();
		General G = new General();
		Luggage lg = new Luggage();
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int type = r.nextInt(4) + 1;
			if (type == 1) {
				arr[i] = f;
			} else if (type == 2) {
				arr[i] = l;
			} else if (type == 3) {
				arr[i] = G;
			} else {
				arr[i] = lg;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Compartment " + (i + 1) + ": " + arr[i].notice());
		}

	}

}
