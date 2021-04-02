//Amanda Poor
//Prof. Arias
//Software Development 1


//Write a program that displays a Pascal triangle. 
//The program prompts the user to enter the number of rows and displays the triangle

import java.util.Scanner;

public class hw05Problem4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //creates int variables
        int rows;
        int i;
        int j;

        //prompts user to enter the number of rows they want displayed for pascals triangle
        System.out.print("Enter the number of rows:");

        //takes number of rows from user and adds one since top of triange is just 1
        rows = input.nextInt() + 1;

        // for loop for index i and j
        for(i = 0; i < rows; i++){
            for(j = 0; j < rows-i; j++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                System.out.print(" "+combination(i, j));
            }
            System.out.println();
            }
    }
    //method that computes factorial
    static int fact(int num) {

        int factorial;
        for(factorial = 1; num > 1; num--){
            factorial *= num;
        }
        return factorial;
    }
    
    //method that computes C(m,n)
    static int combination(int n,int m) {
        return fact(n) / ( fact(n-m) * fact(m) );
    }
    
    
}


        
