package Summer_Assignment_2401920100030.Week_3.OOPS;


import java.util.Random;

// Abstract class
abstract class Compartment {
    public abstract String notice();
}

// First Class
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class: Please maintain silence and comfort.";
    }
}

// Ladies Compartment
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment: Reserved exclusively for women passengers.";
    }
}

// General Compartment
class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment: Please cooperate and avoid overcrowding.";
    }
}

// Luggage Compartment
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment: Passengers are not allowed inside.";
    }
}

// Test Class
public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        // Create random compartments
        for (int i = 0; i < compartments.length; i++) {

            int choice = random.nextInt(4) + 1; // 1 to 4

            switch (choice) {
                case 1 -> compartments[i] = new FirstClass();
                case 2 -> compartments[i] = new Ladies();
                case 3 -> compartments[i] = new General();
                case 4 -> compartments[i] = new Luggage();
            }
        }

        // Demonstrate polymorphism
        System.out.println("Compartment Notices:");
        System.out.println("--------------------");

        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": "
                    + compartments[i].notice());
        }
    }
}
