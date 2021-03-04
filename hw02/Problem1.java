
//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that computes the discriminant 
// for the equation 3x2 + 4x + 5 = 0.

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //allow user to input a,b,c values
        System.out.print("Enter a value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter a value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter a value for c: ");
        double c = input.nextDouble();


        //prints the quadratic equation taken by a,b,c values
        System.out.println("The quadratic equation is " + a + "x^2 + " + b + "x + " + c + "=0");
        
        //computes discriminant
        double discriminant = Math.pow(b,2) - 4*a*c;

        System.out.println("The discriminant for the quadractic equation is " + discriminant);



    }
}


