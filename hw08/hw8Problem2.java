
//Amanda Poor
//Prof. Arias
//Software Development 1

//prompts the user to enter the total number of objects and the weight of each objects
//displays the toal number of containers needed to pack the objects and contents of each containers

import java.util.ArrayList;
import java.util.Scanner;

public class hw8Problem2{

    //main method for user input of weights and objects and print of containers
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //prompts user to enter number of objects
        System.out.print("Enter the number of objects: ");
        int numObjects = input.nextInt();

        //prompts user to enter the weights of the objects
        System.out.print("Enter the weights of the objects: ");

        //creates an array of the weights
        ArrayList<Integer> weightObjects = new ArrayList<>();

        //takes input and adds weight of each object into array list
        for (int i=0; i< numObjects; i++){
            weightObjects.add(input.nextInt());
        }

        //creats string of bins for the weights
        //calls container method
        ArrayList<String> bins= getContainers(weightObjects);

        for(int j=0; j < bins.size(); j++){
            System.out.println("Container " + (j+1)+ " contains  objects with weight " +bins.get(j));

        }
    }

    //method called getContainers that places objects of certain weights in containers
    public static ArrayList<String> getContainers(ArrayList<Integer> weightObjects){
        ArrayList<String> containers = new ArrayList<String>();
        ArrayList<Integer> sums = new ArrayList<Integer>();

        //while loop when weights is not empty
        while(!weightObjects.isEmpty()){
            //declares the index of max and actual max
            int maxIndex=getIndexOfMax(weightObjects);
            int max= weightObjects.get(maxIndex);
            
            //removes the index having the most weight
            weightObjects.remove(maxIndex);

            int i=0;
            boolean found = false;

            //while i less than size of sums arry list and when container is not found
            while(i<sums.size() && !found){
                //if sums of weights is greater than 10
                if (sums.get(i) + max <= 10){
                    //max weight remaining into next container
                    sums.set(i, sums.get(i)+ max);
                    containers.set(i, containers.get(i)+" "+max);
                    found=true;

                }
                i++;
            }
            //if container not found, adds max to end of array list
            if (!found){
                sums.add(max);
                containers.add(""+max);

            }
        }
        //returns the containers for the objects
        return containers;

    }
    //method for getIndexOfMax
    public static int getIndexOfMax(ArrayList<Integer> weightObjects){
        int maxIndex=0;
        for(int i=1; i<weightObjects.size();i++){
            if(weightObjects.get(i) > weightObjects.get(maxIndex)){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
}


