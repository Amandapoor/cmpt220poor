//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that allows user to choose an addition,
//subtraction, multiplication, or division test by either entering 1,2,3 or 4. 
//Number 5 will break the loop


import java.util.Scanner;

public class hw04Problem1 {
    public static void main(String args[]) {
    
        //Main menu is printed 
        System.out.print("Main menu \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division \n 5: Exit \n");
        // scanner input command allowing for user input of coordinates  
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.print("Enter a choice: ");

        //begin syntax for switch
        choice = input.nextInt();

        while (choice != 5) {

        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        switch(choice){

        //menu item 1, Addition case
        case 1:
            System.out.print("What is " + number1 + " + " + number2 + "? :" );
            int add = input.nextInt();

            int answerAdd = number1 + number2;
            if (number1+number2 == add){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Your answer is wrong.");
                System.out.println("The correct answer is "+ answerAdd);
            }
        break;

        //menu item 2, Subtraction case
        case 2:
            //switches numbers so no negative answer
            while (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is " + number1 + " - " + number2 + "? : ");
            int sub = input.nextInt();

            int answerSub = number1 - number2;
            
            if (number1-number2 == sub){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Your answer is wrong.");
                System.out.println("The correct answer is "+ answerSub);
            }
        break;

        
        // menu item 3, Multiplication case
        case 3:
            System.out.print("What is " + number1 + " * " + number2 + "? : ");
            int mult = input.nextInt();

            int answerMult = number1 * number2;
            if (number1 * number2 == mult){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Your answer is wrong.");
                System.out.println("The correct answer is "+ answerMult);
            }
        break;

        
        //menu item 4, Division case
        case 4:
            System.out.print("What is " + number1 + " / " + number2 + "? : ");
            int div = input.nextInt();

            //new number ints make it so second number cant be 0
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10 +1);

            int answerDiv = num1 / num2;
            if (num1/num2== div){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Your answer is wrong.");
                System.out.println("The correct answer is "+ answerDiv);
            }
        break;

        //menu item 5, exit
        case 5:
            System.exit(0); 
        break;

        default:
        
        System.out.println("Error: Out of range");
        System.exit(0);

        }
        //reprints menu
        input.nextLine(); // ignore enter key
        System.out.print("Main menu \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division \n 5: Exit \n");
        System.out.print("Enter a choice: ");
        choice = input.nextInt();
    }
}
}

