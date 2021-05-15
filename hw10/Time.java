//Amanda Poor
//Prof. Arias
//Software Development 1

//time class used in hw10Problem1


import java.util.Calendar;

public class Time implements Cloneable, Comparable {

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
       return (int) (t / 3600);
   }

   public int getMinute() {
       return (int) (t - (getHour() * 3600)) / 60;
   }

   public int getSecond() {
       return (int) t - (getHour() * 3600) - (getMinute() * 60);
   }
  
   public long getSeconds(){
       return t;
   }

   public String toString() {
       return String.format("%d hours %d minutes %d seconds", getHour(),
               getMinute(), getSecond());
   }

   @Override
   public int compareTo(Object arg0) {
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
/* 
class Time {

    private long hours;
    private long minutes;
    private long seconds;
    
    public Time()
    {
    setTimeMilliseconds(System.currentTimeMillis());
    }
    
    public Time(long h, long m, long s)
    {
    hours = h;
    minutes = m;
    seconds = s;
    }
    
    public Time(long elapsedTime)
    {
    setTimeMilliseconds(elapsedTime);
    }
    
    public void setTimeMilliseconds(long mTime)
    {
    mTime /= 1000; // convert to seconds
    
    // determine how many days since epoch
    long days = mTime / (24*60*60);
    mTime = mTime % (24*60*60);
    
    // determine how many hours for time
    hours = mTime / (60*60);
    mTime = mTime % (60*60);
    
    // determine how many minutes
    minutes = mTime / 60;
    
    // determine how many seconds
    seconds = mTime % 60;
    }
    
    public void setTime(long elapsedTime)
    {
    elapsedTime /= 1000; // convert to seconds
    hours += elapsedTime / (60 * 60);
    elapsedTime = elapsedTime % (60*60);
    
    minutes += elapsedTime / (60);
    elapsedTime = elapsedTime % (60);
    
    seconds += elapsedTime;
    }
    
    
    public long getHour()
    {
    return hours;
    }
    
    public long getMinutes()
    {
    return minutes;
    }
    
    public long getSeconds()
    {
    return seconds;
    }
    
    public void print()
    {
    System.out.println(hours + ":" + minutes + ":" + seconds);
    }
    }; */

