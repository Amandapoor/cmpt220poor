//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that prompts the user to enter the 
// coordinates of two points (x1,y1) and (x2, y2), and displays
// the slope of the line that connects the 2 points 

import java.util.Scanner;

public class hw02Problem4 {
    public static void main(String[] args) {
    
        // scanner input command allowing for user input    
        Scanner in = new Scanner(System.in);

        // user prompted to enter the coordinates for two points
        System.out.print("Enter the coordinates for two points (seperated by a space): ");

        //variables for coordinates declared
        double x1 = in.nextDouble(); 
        double y1 = in.nextDouble(); 
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();  

        //formula for slope 
        double slope = (y2 - y1)/ (x2 - x1);

        //slope rounded to 6 decimals
        slope=Math.round(slope * 1000000);
        slope=slope/1000000;

        //output for the slope of the line
        System.out.println("The slope of the line that connects the two points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + slope);


    }

}