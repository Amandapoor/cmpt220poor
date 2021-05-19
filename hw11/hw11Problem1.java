//Amanda Poor
//Prof. Arias
//Software Development 1

//program that prompts the user to enter the number of the items and weight for each 
//item and the weight capacity of the bag, and displays the maximum total weight 
//of the items that can be placed in the bag.


import java.util.Scanner;

public class hw11Problem1{
  
    public static double m(int i, double weightLimit, double[] w){
        
        //if i less than/equal to 0 or weightLimit less than/equal
        if(i<=0 || weightLimit <= 0){
            return 0;
        }
            
        //if w[i-1] greater than weightLimit, return m
        if(w[i-1] > weightLimit){
            return m(i-1, weightLimit, w);
            
        }

        return Math.max(m(i-1, weightLimit, w), w[i-1] + m(i-1, weightLimit - w[i-1], w));
  
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        //user input for number of items
        System.out.print("Enter the number of items: ");
  
        int items = input.nextInt();
        double [] w = new double[items];
        
        //input for weights of each item
        System.out.print("Enter the weights for each item: ");
        
        
        for(int i=0; i<items; i++){
            w[i] = input.nextDouble();
        }
        //input for weight limit for bag
        System.out.print("Enter the weight limit for the bag: ");
        double weightLimit = input.nextDouble();
        
        //prints max weight of each item in bag
        System.out.println("The maximum weight of the items placed in the bag is " + m(items, weightLimit, w) );
    }
}

