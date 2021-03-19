//Amanda Poor
//Prof. Arias
//Software Development 1

//I will create a program that gives a subtraction quiz and displays
// a good or bad message according to student answer

import java.util.Scanner; 

public class hw03Problem4 {
    public static void main(String args[]) {
    
        // generate two random numbers between 0-9
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        //if number1<number2, swap numbers

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        //allow for user input
        Scanner input = new Scanner(System.in);

        //get user input for answer
        System.out.print("What is " + number1 + " - " + number2 + "? : ");

        //declare answer as inputted answer
        int answer = input.nextInt();

        // declare correct answer if user wrong on quiz
        int correct = number1 - number2;

        //returns message if user is right or wrong
        if (number1-number2 == answer){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect");
            System.out.println("The answer should be "+ correct);
        }
    }    
}
