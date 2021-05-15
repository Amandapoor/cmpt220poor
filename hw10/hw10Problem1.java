//Amanda Poor
//Prof. Arias
//Software Development 1

//a program that uses the Time.java file for encapsulating a time


import java.util.Scanner;

public class hw10Problem1 {
    
   public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int h, m, s;
       long t;
       //prompts user to enter time1
       System.out.print("Enter time1 (hour minute second): ");
       h = in.nextInt();
       m = in.nextInt();
       s = in.nextInt();
       Time T1 = new Time(h, m, s);
       System.out.println(T1);
       //prints the time1 in seconds
       System.out.println("Elapsed seconds in time1: " + T1.getSeconds());
       
       //prompts user to enter time2
       System.out.print("Enter time2 (elapsed time): ");
       t = in.nextLong();
       Time T2 = new Time(t);
       System.out.println(T2);
       System.out.println("Elapsed seconds in time2: " + T2.getSeconds());

       //compares time1 to time 2
       System.out.println("time1.compareTo(time2)? " + T1.compareTo(T2));
       Time T3 = T1.clone();
       System.out.println("time3 is created as a clone of time1 time1.compareTo(time3)? "
                       + T1.compareTo(T3));
   }
}