package Abstract;

import java.util.Scanner;

public class question3 {
    private double height;
    private double width;
    private double breadth;

    public void inputDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
    }

    public void displayDimensions() {
        System.out.println("Compartment Dimensions:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
    }

    public static void main(String[] args) {
        Compartment c = new Compartment();
        c.inputDimensions();
        c.displayDimensions();
    }
}
