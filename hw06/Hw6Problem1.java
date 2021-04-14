//Amanda Poor
//Prof. Arias
//Software Development 1

//I will write a program that prompts the user to enter the points of a convex polygon
//and displays the area


import java.util.Scanner; 

public class Hw6Problem1 { 

    public static double polygonArea(double X[], double Y[],  int n) { 
        //creating variable area to be double
        double area = 0.0; 
        
        //initializing variable j 
        int j = n - 1; 
        for (int i = 0; i < n; i++) { 
            //formula for computing the area of the polygon among the 4 triangles
            area += (X[j] + X[i]) * (Y[j] - Y[i]); 
            j = i;  
        } 
        //divides area calculated above by 2
        return Math.abs(area / 2.0); 
    } 

    public static void main (String[] args) { 

        //sets n=6 for the 6 points
         int n=6;
         double x[]=new double[n];
         double y[]=new double[n];

         //allows for user input of the 6 coordinates
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the coordinates for six points of the polygon:");
         for(int i=0;i<6;i++) {
                //variables x and y with index i
                 x[i]=input.nextDouble();
                 y[i]=input.nextDouble();
         }
    //returns the total area of the polygon
     System.out.println("The total area is " + polygonArea(x, y, n)); 
     
     
 } 

}
