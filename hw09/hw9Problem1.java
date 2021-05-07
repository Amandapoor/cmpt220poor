//Amanda Poor
//Prof. Arias
//Software Development 1

//I will write a program that creates an array with 100 randomly chosen integers
//and prompts the user to enter the index of the array, then displays the cooresponding
//element value

import java.util.Random;
import java.util.Scanner;


public class hw9Problem1{

    public static void main(String[] args){
        //declares a constnat for string of size 100
        final int SIZE =100;

        //creates object of random class
        Random random = new Random();

        Scanner input = new Scanner(System.in);

        //initailized array to store 100 int values
        int[] arr = new int[SIZE];

        //fill array with 100 randomly chosen integers
        for (int i = 0; i < SIZE; i++){
            arr[i] = 1 + random.nextInt(100);
        }

        //prompts user to enter index of the array
        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();

        //try-catch to test ArrayIndexOutofBoundsException

        try{
            int value = arr[index];

            //if index within array bounds, then display value stored at index

            System.out.println("Corresponding value at index " + index + " is " + value);
        }
        catch(ArrayIndexOutOfBoundsException ex){

            //if index is out of order, then display out of bounds
            System.out.println("Out of Bounds");
            
        }


    }
}