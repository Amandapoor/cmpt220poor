//Amanda Poor
//Prof. Arias
//Software Development 1

//Write a test program that prompts the user to enter the number of the items and weight 
//for each item and the weight capacity of the bag, and displays the maximum total 
//weight of the items that can be placed in the bag

import java.util.ArrayList;
import java.util.Scanner;

public class hw11Problem2{
        public static void main(String[] args) {
                //initialise the scanner object.
                Scanner sc = new Scanner(System.in);
                              
                //prompt for no of items
                System.out.print("Enter the number of items: ");
                int i = sc.nextInt();
              
                //prompt for individual items
                System.out.print("Enter the weights for each item: ");
                //the below loop will get all the required weights and assign it to the array
                int[] weightsArray = new int[i];
                for(int j = 0; j < i; j++) {
                        weightsArray[j] = sc.nextInt();
                }
              
                //prompt for the weight limit
                System.out.print("Enter the weight limit for the bag: ");
                int weightLimit = sc.nextInt();
              
                //close the scanner
                sc.close();
              
                //call the function and pass the parameters.
                ArrayList<Integer> result = m(i, weightLimit, weightsArray);
              
        }
      
        public static ArrayList<Integer> m(int i, int weightLimit, int[] w) {
                
                ArrayList<Integer> result = new ArrayList<Integer>();

                //print the max weight of items in bag
                System.out.print("The maximum weight of the items placed in the bag is " + weightLimit);
              
                //declare temporary variables
                boolean matchFound = false;
                boolean matchPartialFound = false;
                int matchIndex1 = -1, matchIndex2 = -1;
                int maxWeight = -1;
              
                //the below outer loop and inner loop will scan through the pairs of items in the array and take decision
                for(int j = 0; j < i-1; j++) {
                        for(int k = j+1; k < i; k++) {
                                //calculate the sum of jth and kth element in the array
                                int sum = w[j] + w[k];
                              
                                //check if the sum is equal to the weight limit
                                //if so, assign the required variables and quit the loop.
                                if(sum == weightLimit) {
                                        matchFound = true;
                                        matchIndex1 = j;
                                        matchIndex2 = k;
                                        break;
                                }
                                //check if the sum is less than weight limit
                                else if(sum < weightLimit) {
                                        //check if the sum is greater than maxWeight.
                                        //if so, assign the required variables. do not quit the loop as some other combination can be a better choice to fill in the bag.
                                        if(sum > maxWeight) {
                                                maxWeight = sum;
                                                matchIndex1 = j;
                                                matchIndex2 = k;      
                                                matchPartialFound = true;                                             
                                        }
                                }
                        }     
                        if(matchFound)
                                break;
                }     
              
                System.out.println("");
                //print the data if the below condition satisfies.
                if(matchFound || matchPartialFound) {
                        System.out.println("The items in the bag are #" + (matchIndex1+1) + " #" + (matchIndex2+1));
                        System.out.println("The weights of the items in the bag are " + w[matchIndex1] + " " + w[matchIndex2]);
                        result.add(w[matchIndex1]);
                        result.add(w[matchIndex2]);
                }
                return result;
        }
}

