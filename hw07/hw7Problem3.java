//Amanda Poor
//Prof. Arias
//Software Development 1

//This program prompts the user to enter three points and displays the center point
//This program uses a Point class with two private data fields x and y,
//calling from file Point.java

import java.util.Scanner;

public class hw7Problem3 {
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
            
            
            getTriangleArea(p1, p2, p3); 
          
    } 
    static void getTriangleArea(Point p1, Point p2, Point p3) { 

        //formula for center points x and y 
        //double s1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		//double s2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		//double s3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		//double sides = (s1 + s2 + s3) / 2;

		//double area = Math.pow(sides * (sides - s1) * (sides - s2) * (sides - s3), 0.5);

        double area = ((p1.getX()*(p2.getY()-p3.getY()) + p2.getX()*(p3.getY()-p1.getY())+ p3.getX()*(p1.getY()-p2.getY()))/2.0);
        
        if (Math.abs(area)==0){
            System.out.println("The three points are on the same line.");
        }
        else{
            System.out.println("The area of the triangle is " + Math.abs(area)); 
        }
    }

}