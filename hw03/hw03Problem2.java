//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that prompts the user to enter the coordinates
// of two points and displays the line equation in the slope-intercept form


import java.util.Scanner;

public class hw03Problem2 {
    public static void main(String args[]) {
    
        // scanner input command allowing for user input of coordinates    
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the coordinates for two points (seperated by a space): ");

        //variables for coordinates declared
        double x1 = in.nextDouble(); 
        double y1 = in.nextDouble(); 
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();  
        
        //variable for slope declared
        double slope = (y2 - y1)/ (x2 - x1);
        slope=Math.round(slope * 10000);
        slope=slope/10000;

        //variable for b declared
        double b = y1-((slope*(x1)));
        
        //conditions according to rule: "Don’t display m if it is 1 and don’t display b if it is 0."
        if (slope == 1) {
            System.out.println("The line equation for the two points ("+x1+","+y1+") and ("+x2+","+y2+") is y = x");
        }
        else if (slope !=1 && b == 0) {
            System.out.print("The line equation for the two points ("+x1+","+y1+") and ("+x2+","+y2+") is " + "="+ 0); 
         
        }
        else {
            System.out.println("The line equation for the two points ("+x1+","+y1+") and ("+x2+","+y2+") is y = "+ slope +"x +"+ "("+b+")");
        }

       

    }
}
