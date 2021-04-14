//Amanda Poor
//Prof. Arias
//Software Development 1


//I will write a test program that prompts the user to enter a,b,c,d for a matrix, 
//and displays the invers matrix

import java.util.Scanner;

public class hw6Problem4{
 
    //method to obtain an inverse of the matrix
    public static double [][] inverse (double[][] A) {

        //creating double variables for a,b,c,d at specific row and column in matrix
        double a = A[0][0];
        double b = A[0][1];
        double c = A[1][0];
        double d = A[1][1];
        
        //formula for the determinant of matrix
        double determ = a * d - b * c;
        if (determ == 0)
            return (null);
        
        //divides each value in matrix by determinant to get new matrix
        A[0][0] = d / determ;
        A[0][1] = -b / determ;
        A[1][0] = -c /determ;
        A[1][1] = a / determ;
        return (A);
    }
        //main method for user input and output
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            
            //prompts user to enter values of matrix
            System.out.print("Enter a, b, c, d: ");
            double a = input.nextDouble ();
            double b = input.nextDouble ();
            double c = input.nextDouble ();
            double d = input.nextDouble ();
                
            double [][]arr = { {a, b}, {c, d} };
                
            //tests to see if determinant is 0; if 0 then no inverse matrix
            if (inverse (arr) == null){
                System.out.println ("No inverse matrix.");
            }

            //prints the new values of the matrix specific by row and column location
            else {
                System.out.println("" + arr[0][0] + " " + arr[0][1]);
                System.out.println("" + arr[1][0] + " " + arr[1][1]);
            }
    }
}

