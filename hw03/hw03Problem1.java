//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that prompts the user to enter the numerator
// and denominator of a fraction. The program determines whether the 
// number is a proper fraction or an improper fraction.


import java.util.Scanner;

public class hw03Problem1 {
    public static void main(String[] args) {
    
        // scanner input command allowing for user input    
        Scanner in = new Scanner(System.in);

        // user prompted to enter numerator
        System.out.print("Enter a numerator: ");
        int num = input.nextInt(); 

        // user prompted to enter denominator
        System.out.print("Enter a denominator: ");
        int denom = input.nextInt(); 
       
     
        if (num < denom) {
            System.out.println(num + " / " + denom + " is a proper fraction"); 
        }
        else if (num % denom == 0) {
            System.out.print(num + " / " + denom + " is an improper fraction "); 
            System.out.println("and it can be reduced to " + num / denom); 
        }
        else {
            System.out.print(num + " / " + denom + " is an improper fraction "); 
            System.out.println("and its mixed fraction is " + num / denom + " + " +  
                num % denom + " / " + denom); 
        }
    }  

}
