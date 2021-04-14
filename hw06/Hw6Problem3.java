//Amanda Poor
//Prof. Arias
//Software Development 1


//I will write a program that prompts the user to enter two strings and if
//they are anagrams, displays two strings are anagrams, and displays two 
//strings are not anagrams if they are not


import java.util.Scanner;

public class Hw6Problem3{

    //method for comparing words and deciding if anagram
    public static boolean isAnagram(String s1, String s2) {
        //converts strings to lower case
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        //replaces space
        s1=s1.replace(" ", "");
        s2=s2.replace(" ", "");
        //gets rid of hyphen when comparing strings
        s1=s1.replace("-", "");
        s2=s2.replace("-", "");

        if (s1.length() != s2.length())
            return false;
 
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            int index = s2.indexOf(c);

            // If index of any character is -1, then two strings are not anagrams
            // If index of character is not equal to -1, then remove the chacter from the string
            if (index != -1) {
                s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
            } 
            else{
                return false;
            }
        }
        return s2.isEmpty();
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompts user to enter the first string
        System.out.print("Enter the first String: ");
        String s1 = input.next();

        //prompts user to enter second string
        System.out.print("Enter the second String: ");
        String s2 = input.next();
 
        //loop for output: either anagram or not anagram
        if (isAnagram(s1,s2)){
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        }
        else{
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
 
    }

 
}
 