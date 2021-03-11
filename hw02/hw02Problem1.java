//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that prompts the user to enter the width and height of 
// a rectangle and displays the perimeter, are and length of the 
// diagonal. 

import java.util.Scanner;

public class hw02Problem1 {
    
    public static void main(String[] args) {

        // scanner input command allowing for user input
        Scanner input = new Scanner(System.in);
        
        //asks user for height
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();  

        //asks user for width
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble(); 

        // sets equations for perimeter, area, diagonal
        double perimeter = (2 * width) + (2 * height);
        double area = width * height;
        double diagonal = Math.sqrt(Math.pow(width,2) + Math.pow(height,2));

        //rounds the equations to have 2 decimals
        perimeter = Math.round(perimeter * 100);
        perimeter = perimeter/100;

        area = Math.round(area * 100);
        area = area/100;

        diagonal = Math.round(diagonal * 100);
        diagonal = diagonal/100;

        //user output
        System.out.println("The perimeter of the rectangle is " + perimeter + " units.");
        System.out.println("The area of the rectangle is " + area + " units.");
        System.out.println("The length of the diagonal of the rectangle is " + diagonal + " units.");


    
    }
    
}
