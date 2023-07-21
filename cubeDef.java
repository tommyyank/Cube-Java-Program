/* Tom Yankowski
 * This class will define a cube
 * Three properties
 * Ten methods
 * Methods so the user can change the value of the properties and two methods for calculating 
 * */

public class cubeDef {
    // Properties
    private double length;   // Length of the cube
    private String color;    // Color of the cube
    private boolean cubeFill; // Fill status of the cube (true for filled, false for hollow)

    // Constructor to initialize the cube with default values
    public cubeDef() {
        length = 1.00;     // Default length of the cube is set to 1.00
        color = "black";   // Default color of the cube is set to "black"
        cubeFill = false;  // Default fill status is set to false (hollow)
    }

    // Set method to change the value of the length property
    public void setlength(double l) {
        length = l;
    }

    // Set method to change the value of the color property
    public void setcolor(String c) {
        color = c;
    }

    // Set method to change the value of the cubeFill property
    public void setfill(boolean f) {
        cubeFill = f;
    }

    // Get method to retrieve the value of the length property
    public double getlength() {
        return length;
    }

    // Get method to retrieve the value of the color property
    public String getcolor() {
        return color;
    }

    // Get method to retrieve the value of the cubeFill property
    public boolean getfill() {
        return cubeFill;
    }

    // Method to calculate the surface area of a cube
    public double surfaceArea() {
        double a = 2;
        double area = 6 * Math.pow(length, a); // Surface area formula for a cube is 6 * length^2
        return area;
    }

    // Method to calculate the volume of a cube
    public double cubevolume() {
        double a = 3;
        double volume = Math.pow(length, a); // Volume formula for a cube is length^3
        return volume;
    }

    // Method to resize the cube by adding a specified value to its length
    public double resize(double y) {
        length += y; // Add the specified value (y) to the current length
        return length; // Return the new length after resizing
    }
}
