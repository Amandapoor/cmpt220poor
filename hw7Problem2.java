//Amanda Poor
//Prof. Arias
//Software Development 1

//This program prompts the user to enter three points and area of a triangle
//This program uses a Point class with two private data fields x and y,
//calling from file Point.java

import java.util.Scanner;

public class hw7Problem2 {
    public static void main(String args[]){ 
        Scanner s = new Scanner(System.in);

            //initializing the variables
            double x1,y1,x2,y2,x3,y3;

            //user input of the coordinates
            System.out.print("Enter x1,y1,x2,y2,x3,y3 ");
    
            x1 = s.nextDouble();
            y1 = s.nextDouble();
            x2 = s.nextDouble();
            y2 = s.nextDouble();
            x3 = s.nextDouble();
            y3 = s.nextDouble();
        

            Point p1 = new Point(x1, y1); 
            Point p2 = new Point(x2, y2); 
            Point p3 = new Point(x3, y3); 
            
            
            getCenterPoint(p1, p2, p3); 
          
    } 

    static void getCenterPoint(Point p1, Point p2, Point p3) { 

            //formula for center points x and y 
            double x = (p1.getX() + p2.getX() + p3.getX())/3; 
            double y = (p1.getY() + p2.getY() + p3.getY())/3; 


            //prints the point in the center of the triangle
            System.out.println("The center point is at (" + x +", "+ y + ")"); 
            
    }

}

        

