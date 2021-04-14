//Amanda Poor
//Prof. Arias
//Software Development 1

//I will write a method that counts the occurrences of each digit in a string
//that the user inputs

import java.util.Scanner;

public class Hw6Problem2 {

    public static int[] count(String s) {
        int[] counts = new int[10];

        //for loop counting instances of certain digit in string
        for(int i = 0; i < s.length(); ++i) {
            if(Character.isDigit(s.charAt(i))) {
                counts[s.charAt(i)-'0']++;
            }
        }
        //used in main method for the number of each digit
        return counts;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompts user to enter a string
        System.out.print("Enter a string: ");
        String line = input.nextLine();

        //count of the digits
        int[] counts = count(line);
        for(int i = 0; i < counts.length; ++i) {
            //if there is 1 or more occurrences of a digit, displays number
            if(counts[i] != 0) {
                System.out.printf("Digit %d occurs %d times\n", i, counts[i]);
            }
        }
    }

}
