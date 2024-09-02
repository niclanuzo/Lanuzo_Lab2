// Cylinder.java
import java.util.Scanner;

// Base class
class Cylinder {
    double radius, height;

    // Method to get input for radius and height
    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();
    }

    // Method to calculate the area of the cylinder
    double area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}

// Derived class
class CylinderVol extends Cylinder {

    // Method to calculate the volume of the cylinder
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Main class to run the program
public class CylinderVolume {
    public static void main(String[] args) {
        // Creating an object of the derived class
        CylinderVol cylinderVol = new CylinderVol();
        
        // Getting input and calculating area and volume
        cylinderVol.getInput();
        double area = cylinderVol.area();
        double volume = cylinderVol.volume();

        // Displaying the results
        System.out.println("The surface area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
