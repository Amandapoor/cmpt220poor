//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that prompts user to enter a positive integer and obtains 
//square root in simplest form

import java.util.Scanner;


public class hw04Problem4 {
    public static void main(String[] args) {
    
        //allows for user input
        Scanner input = new Scanner(System.in);
        //prompts user to enter a postive integer
        System.out.print("Enter a positive integer: ");

        int number = input.nextInt();

        //declares variable for number under rad
        int inRad = number;
        //sets number outside rad to be 1
        int outRad =1;
        //declares m to be 2 so it can simplify rad, smallest factor
        int m=2;
        while (m*m<=inRad){
            if(inRad % (m*m) == 0){
                inRad = inRad/(m*m);
                outRad=outRad * m;
            }
            //increments m by 1 if least common factor is odd
            else
                m+=1;
        }
            
        //prints the result depending on inside and outside rad value
        if(outRad!=1 && inRad !=1){
            System.out.println("sqrt("+number+") is "+outRad+"*sqrt("+inRad+")");
        }
        else if (inRad==1 && outRad !=1){
            System.out.println("sqrt("+number+") is " +outRad);
        }
        else if (inRad!=1 && outRad==1){
            System.out.println("sqrt("+number+") is "+"sqrt("+inRad+")");
        }
        else{
            System.out.println("sqrt("+number+") is " +1);
        }
    }
}