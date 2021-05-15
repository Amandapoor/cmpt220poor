//Amanda Poor
//Prof. Arias
//Software Development 1

//program that prompts the user to enter two rational numbers
//as strings and displays their addition


import java.util.Scanner;


public class hw10Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Enter the first rational number: ");
        String rational1 = sc.nextLine();
                
        System.out.print("Enter the second rational number: ");
        String rational2 = sc.nextLine();
                
        sc.close();
                
        Rational rat1 = Rational.parseRationalNumber(rational1);
        Rational rat2 = Rational.parseRationalNumber(rational2);
                
        System.out.println(rat1+" + "+rat2+" = "+rat1.add(rat2));
    }
}