//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that prompts the user to enter the travel time of a ball 
// in seconds which will calculate the height of the building 

import java.util.Scanner;

public class hw02Problem2 {
    public static void main(String[] args) {

        // scanner input command allowing for user input
        Scanner input = new Scanner(System.in);

        // user enters ball travel time
        System.out.print("Enter the ball travel time in seconds: ");
        double time = input.nextDouble(); 

        //rounding time so user can enter any value
        time = Math.round(time * 100);
        time = time/100;

        //setting variables for initial velocity and acceleration
        double v0 = 0;
        double a = 9.8;

        // gives equation to calculate height of building
        double height = v0 * time + a * ((Math.pow(time, 2))/2);
        
        // rounds answer to 3 decimal places
        height=Math.round(height * 1000);
        height=height/1000;

        // user output for height of building 
        System.out.println("The height of the building is " + height + " meters.");
    }   

}
