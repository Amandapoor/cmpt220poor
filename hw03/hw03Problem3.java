//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that generates a random point inside a 
// circle centered at (0,0) with a radius 5


public class hw03Problem3 {
    public static void main(String args[]) {

    // defined the radius with a min and max of -5 and 5
    double rad_max =  5.0;  
    double rad_min = -5.0;

   //generating random number between 5 and -5 for both x and y
    double point1 = rad_min + Math.random() * (rad_max - rad_min);
    double point2 = rad_min + Math.random() * (rad_max - rad_min);

    // because center is at (0,0), formular for distance reduced to following:   
    double distance= Math.sqrt(Math.pow(point1, 2)+Math.pow(point2,2));

    //prints the points and the distance from coord to center
    System.out.println("The point is ("+ point1 +","+point2+") and its distance to the center is " + distance);
    }
}
