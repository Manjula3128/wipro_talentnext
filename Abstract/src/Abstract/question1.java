package Abstract;
import java.util.Random;
import java.util.Scanner;

// Abstract class
abstract class Compartment {
    public abstract String notice();
}

// Derived classes
class FirstClass extends Compartment {
    public String notice() {
        return "Notice: This is a First Class Compartment.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Notice: This is a Ladies Compartment.";
    }
}

class General extends Compartment {
    public String notice() {
        return "Notice: This is a General Compartment.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Notice: This is a Luggage Compartment.";
    }
}

// Main class
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        System.out.println("Generating random compartments...");

        for (int i = 0; i < compartments.length; i++) {
            int type = rand.nextInt(4) + 1; // generates 1 to 4
            switch (type) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        System.out.println("\nDisplaying notices for each compartment:");
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }

        sc.close();
    }
}
