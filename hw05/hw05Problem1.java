//Amanda Poor
//Prof. Arias
//Software Development 1


// I will Write a test program that prompts the user to 
//enter a decimal integer value and displays the corresponding binary value.


import java.util.Scanner;

public class hw05Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompts user to enter the integer to be converted into binary
        System.out.print("Enter an integer: ");
        int value = input.nextInt();

        //prints the binary value of the integer
        System.out.println("The binary value is " + decimalToBinary(value));
    }
    public static String decimalToBinary(int value) {
        String result = "";
        return decimalToBinary(value, result);

    }
    //Class that converts the integer to binary
    public static String decimalToBinary(int value, String result) {
		if (value / 2 == 0) // Base case
			return (value % 2) + result;
		else
			return decimalToBinary(value / 2, (value % 2) + result); // Recursive call
    }
    
}
