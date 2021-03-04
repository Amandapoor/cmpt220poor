//Amanda Poor
//Prof. Arias
//Software Development 1

// I will write a program that displays the average acceleration


public class Problem2 {

    public static void main(String[] args) {

        // values for v0, v1, and t to be fed into equation
        double v0 = 5.6;
        double v1 = 10.5;
        double t = 0.5;

        //equation for average acceleration
        double a = (v0 - v1) / t;

        //lets user know what values are and there units
        System.out.println("The starting velocity is " + v0 + " meters/second");
        System.out.println("The ending velocity is " + v1 + " meters/second");
        System.out.println("The time span is " + t + " seconds");

        //prints the computed acceleration w units
        System.out.println("The average acceleration using formula a=(v0-v1)/t is " + a + " meters/second^2");

    }
}   


        
