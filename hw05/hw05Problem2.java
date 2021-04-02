//Amanda Poor
//Prof. Arias
//Software Development 1


//Write a test program that prompts the user to enter a string and invokes
// this method, and displays the return value from this method.

import java.util.Scanner;

public class hw05Problem2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // prompts user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        //print the new string with Capitals and single spaces between words
        System.out.println("The new string is " + title(s.trim().replaceAll("\\s+", " ")));
    }
 
  
    public static String title(String s) {

        // splits the string at the space
        String[] arr = s.split(" ");
       
        //creates a buffer in string
        StringBuffer sb = new StringBuffer();
        
        // for loop for converting the string to Upper case letters at first letter of each word; uses indexing i
        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        }  
        //removes buffer from string        
        return sb.toString().trim();

    }  

 }
