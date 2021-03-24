//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that promts the user to enter the number of sides, 
//the radius of the bounded circle of a polygon, and displays the coordinates
// of the corner points of the polygon


import java.util.Scanner;

public class hw04Problem2 {
    public static void main(String args[]) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of the sides: ");
    int sides = input.nextInt();

    System.out.print("Enter the radius of the bounding circle: ");
    double radius = input.nextDouble();

    input.close();

    System.out.println("The coordinates of the points on the polygon are");

    for (int i=0; i<sides; i++){
        double point1= radius * Math.cos(2.0 * Math.PI/ sides*i);
        double point2= radius * Math.sin(2.0 * Math.PI/ sides*i);
        System.out.print("(");
        System.out.printf("%.2f", point1);
        System.out.print(" , ");
        System.out.printf("%.2f",point2);
        System.out.print(")");
        System.out.println();
        }

    } 
    
}



