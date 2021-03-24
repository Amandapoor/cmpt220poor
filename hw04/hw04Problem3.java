//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that promts the user to enter a genome and displays all 
//genes in the genome. If no genome is found in the input sequence, it will display
// no genome is found

import java.util.Scanner;

public class hw04Problem3 {
    public static void main(String[] args) {
        String result = "";
    
        Scanner input = new Scanner(System.in);
        //user input of genome
        System.out.print("Enter a genome string: ");
        String gen = input.next();
        //changes string to uppercase
        String genome = gen.toUpperCase();

        //index i and j
        int i=0,j=0;

        while(i<=genome.length()-3){
            //makes sure the genome starts with ATG
            if(genome.substring(i,i+3).equals("ATG")){
                i=j=i+3;
                while(j<=genome.length()-3){
                    if(genome.substring(j,j+3).equals("ATG")){
                        i=j=j+3;
                    }
                    //tests to see if there are genes in genome
                    if(genome.substring(j,j+3).equals("TAG")|| genome.substring(j,j+3).equals("TAA")|| genome.substring(j,j+3).equals("TGA")){
                        result=genome.substring(i,j);
                        System.out.println(result);
                        break;
                    }
                    j++;
                }
                continue;
            }
            i++;
        }
        //if no gene is found, returns that
        if(result==""){
            System.out.println("No gene found");
        }
    }
}