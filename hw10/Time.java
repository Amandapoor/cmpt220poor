//Amanda Poor
//Prof. Arias
//Software Development 1

//time class used in hw10Problem1


import java.util.Calendar;

public class Time implements Cloneable, Comparable<Time> {

   private long t;

   public Time() {
       t = System.currentTimeMillis() / 1000;
   }

   public Time(long t) {
       this.t = t;
   }

   public Time(int h, int m, int s) {
       t = (((h * 60) + m) * 60) + s;
   }

   public int getHour() {
       return (int) (t / 3600) % 24;
   }

   public int getMinute() {
       return (int) ((t - (getHour() * 3600)) / 60) % 60;
   }

   public int getSecond() {
       return (int) t % 60);
   }
  
   public long getSeconds(){
       return t;
   }

   public String toString() {
       return String.format("%d hours %d minutes %d seconds", getHour(),
               getMinute(), getSecond());
   }

   @Override
   public int compareTo(Time arg0) {
       return (int) (t - ((Time)arg0).t);
   }
  
   public Time clone(){
       Time T2 = new Time();
       T2.t = t;
       return T2;
   }
  
   public boolean equals(Time T){
       return T.t == t;
   }

}

