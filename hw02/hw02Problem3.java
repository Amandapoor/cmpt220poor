//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that prompts the user to enter input for Force (F),
// mass (m), and acceleration (a) and will output the coefficient
// of friction 

import java.util.Scanner;

public class hw02Problem3 {
    public static void main(String[] args) {

        // scanner input command allowing for user input
        Scanner input = new Scanner(System.in);

        // user enters friction force in Newtons
        System.out.print("Enter the friction force in Newtons: ");
        double F = input.nextDouble(); 

        //user enters objects mass in kg
        System.out.print("Enter the object's mass in kg: ");
        double m = input.nextDouble(); 

        //user enters objects acceleration in m/s^2
        System.out.print("Enter the object's acceleration in m/s^2: ");
        double a = input.nextDouble(); 

        //sets acceleration variable
        double g = 9.8;

        //equation to calculate coefficient of friction
        double coefficient = (F - m*a)/(m*g);

        //rounds coefficient answer to 6 decimal places
        coefficient=Math.round(coefficient * 1000000);
        coefficient=coefficient/1000000;

        // gives user output for coefficient of friction 
        System.out.println("The coefficient for friction is " + coefficient);


    }
}
