//Amanda Poor
//Prof. Arias
//Software Development 1


//Write a test program returns a string in the form of hour:minute:second 
//for a given total seconds using the header

import java.util.Scanner;

public class hw05Problem3 {

    public static String format(long seconds) {
        //converts the seconds into hours, and minutes
        int hours = (int)(seconds / 3600) % 24;
        seconds %= 3600;
        int minutes = (int) (seconds / 60);
        seconds %= 60;
        //coverts the time with hours, minutes and seconds in format
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        //allows for user input
        Scanner in = new Scanner(System.in);

        //asks user to enter the seconds they want to convert into new time
        System.out.print("Enter time in seconds: ");

        //converts seconds into a long
        long seconds = in.nextLong();

        //displays the time to the user using the format
        System.out.println("The hours, minutes, and seconds for total seconds " + seconds+ " is " + format(seconds));
    }
}