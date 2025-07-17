interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {
    
    public void message() {
    	 Vehicle.super.message();
        
    	 FourWheeler.super.message();
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.message();  
    }
}
