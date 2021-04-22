//Amanda Poor
//Prof. Arias
//Software Development 1

//This program returns the intersectding points between two points
//This program uses a Point class with two private data fields x and y,
//calling from file Point.java


import java.util.Scanner;

public class hw7Problem1 {

    public static void main(String args[]){ 
        Scanner s = new Scanner(System.in);

            //initializing the variables
            double x1,y1,x2,y2,x3,y3,x4,y4;

            //user input of the coordinates
            System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4 ");
    
            x1 = s.nextDouble();
            y1 = s.nextDouble();
            x2 = s.nextDouble();
            y2 = s.nextDouble();
            x3 = s.nextDouble();
            y3 = s.nextDouble();
            x4 = s.nextDouble();
            y4 = s.nextDouble();

            Point p1 = new Point(x1, y1); 
            Point p2 = new Point(x2, y2); 
            Point p3 = new Point(x3, y3); 
            Point p4 = new Point(x4, y4); 
    
            
            getIntersectingPoint(p1, p2, p3, p4); 

          
    } 

    static void getIntersectingPoint(Point p1, Point p2, Point p3, Point p4) { 
        //Line AB represented as ax + by = c 
            double a1 = p2.getY() - p1.getY(); 
            double b1 = p1.getX() - p2.getX(); 
            double c1 = a1*(p1.getX()) + b1*(p1.getY()); 
        
        // Line CD represented as dx + ey = f 
            double a2 = p4.getY()- p3.getY(); 
            double b2 = p3.getX() - p4.getX(); 
            double c2 = a2*(p3.getX())+ b2*(p3.getY()); 
        
            //formula for the determinant
            double determinant = a1*b2 - a2*b1; 
        
            //parallel lines
            if (determinant == 0) { 
                // We cannot find a solution for determinent 0
                System.out.print("The lines are parallel."); 
            } 
            //intersecting point
            else{ 
                double x = (b2*c1 - b1*c2)/determinant; 
                double y = (a1*c2 - a2*c1)/determinant; 
                //prints the point of intersection
                System.out.println("The intersecting point is at (" + x +", "+ y + ")"); 
            } 
        }

        

} 
