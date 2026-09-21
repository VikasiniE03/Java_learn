class Vehicle {
    Vehicle(String brand) {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car() {
        // Explicitly calling parent's parameterized constructor
        super("Ferrari!"); 
        System.out.println("Car constructor executed.");
    }
}

public class Super {
    public static void main(String[] args) {
        Car myCar = new Car();
    }
}
 //super keyword is a reference variable used refer directly to the IMMEDIATE parent


 