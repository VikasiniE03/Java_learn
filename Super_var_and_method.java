// In Java, the super keyword is a reference variable used to refer directly to the immediate parent (superclass) object. 

// It has three primary use cases:

// 1.  Invoke parent class constructor (super())

// 2. Access parent class instance variable (super.variable)

// 3. Invoke parent class method (super.method())

// Parent Class
class Animal {
    String color = "White"; // Parent variable

    // Parent Constructor
    Animal(String species) {
        System.out.println("Animal created: " + species);
    }

    // Parent Method
    void displayInfo() {
        System.out.println("This is a general animal.");
    }
}

// Child Class
class Dog extends Animal {
    String color = "Black"; // Child variable hiding parent variable

    // Child Constructor
    Dog() {
        // 1. Calling parent constructor with argument
        super("Canine"); 
        System.out.println("Dog created.");
    }

    void displayDetails() {
        // 2. Accessing child and parent variables
        System.out.println("Dog color: " + color);        // Refers to Dog's color
        System.out.println("Animal color: " + super.color); // Refers to Animal's color

        // 3. Calling parent method
        super.displayInfo();
    }
}

public class Super_var_and_method {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out.println("---");
        myDog.displayDetails();
    }
}