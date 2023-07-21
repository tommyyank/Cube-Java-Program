/* Tom Yankowski
 * This program will create cubes
 * It will use a predefined class
 * One loop will be used to get information from the user 
 * Another loop will be used to print the cube
 * */
import java.io.*;
import java.util.Scanner;

public class cube {
    public static void main(String[] args) throws IOException {
        boolean cubeFill = false; // Indicates if the cube is filled or not (true for filled, false for hollow)
        String color; // Stores the color of the cube
        double length; // Stores the length of the cube
        cubeDef[] c = new cubeDef[3]; // An array of 3 cube references
        int i, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String k; // Stores the user input for whether to change the cube or not
        double y; // Stores the user input for the percentage to resize the cube
        String r; // Stores the user input for whether to resize the cube or not
        String fill; // Stores the user input for cube filling

        // Loop to create and modify the cubes
        for (i = 0; i < c.length; i++) {
            c[i] = new cubeDef(); // Create a new cube object
            System.out.println("Would you like to change the cube?");
            k = br.readLine();
            if (k.equals("yes")) {
                System.out.println("Enter the length you want for your cube");
                length = sc.nextDouble();
                c[i].setlength(length); // Assigns the user input as the new length of the cube
                System.out.println("Enter the color for your cube");
                color = br.readLine();
                
                
                c[i].setcolor(color); // Assigns the user input as the new color of the cube
                System.out.println("Would you like to have your cube be filled? (yes or no) ");
                fill = br.readLine();
                
                if (fill.equals("yes")) {
                    cubeFill = true;
                    c[i].setfill(cubeFill); // Set cubeFill property to true if the user wants a filled cube
                } else {
                    cubeFill = false;
                    c[i].setfill(cubeFill); // Set cubeFill property to false if the user wants a hollow cube
                }
                
                
            } else if (k.equals("no")) {
                System.out.println(); // Empty line for formatting
                System.out.println("Would you like to resize the cube (yes or no) ");
                r = br.readLine();
                
                
                if (r.equals("yes")) {
                    System.out.println("Enter the percentage to resize the cube");
                    y = sc.nextDouble();
                    c[i].resize(y); // Resize the cube by the specified percentage
                } else {
                    System.out.println(); // Empty line for formatting
                }
                
            }
        }

        // Loop to display information about each cube
        for (j = 0; j < c.length; j++) {
            System.out.println("The length of the cube: " + c[j].getlength() + " cm");
            System.out.println("The color of the cube: " + c[j].getcolor());
            c[j].getfill();
            if (cubeFill == true)
                System.out.println("Your cube is filled");
            else
                System.out.println("Your cube is not filled");

            System.out.printf(" The surface area of your cube is: %.2f cm\n ", c[j].surfaceArea()); // Print surface area to two decimal places

            System.out.printf(" The volume of your cube is: %.2f cm\n ", c[j].cubevolume()); // Print volume to two decimal places
            System.out.println("\n");
        }
    }
}

    
    
   
  
  
