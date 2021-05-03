//Amanda Poor
//Prof. Arias
//Software Development 1

//defines the Flight class used in Problem3
import java.util.GregorianCalendar;


public class Flight {
    //declares flightNo, departureTime, arrivalTime
    private String flightNo;
    private GregorianCalendar arrivalTime;
    private GregorianCalendar departureTime;


    //Flight consturctor
    public Flight (String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime){
        this.flightNo=flightNo;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
    }

    //getter for flightNo
    public String getflightNo(){
        return flightNo;
    }
    //getter for departureTime
    public GregorianCalendar getDepartureTime(){
        return departureTime;
    }
    //getter for arrivalTime
    public GregorianCalendar getArrivalTime(){
        return arrivalTime;
    }
    //setter for departureTime
    public void setDepartureTime(GregorianCalendar departureTime){
        this.departureTime=departureTime;
    }

    //setter for arrivalTime
    public void setArrivalTime(GregorianCalendar arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    //returns the time of flight in minutes
    public int getFlightTime(){
        ZonedDateTime zdt1 = departureTime.toZonedDateTime() ;
        ZonedDateTime zdt2 = arrivalTime.toZonedDateTime() ;
        return (zdt2.getDayOfYear()*24*60+zdt2.getHour()*60+zdt2.getMinute())-(zdt2.getDayOfYear()*24*60+zdt1.getHour()*60+zdt1.getMinute());
        }

    }
