//Amanda Poor
//Prof. Arias
//Software Development 1

//defines the Flight class used in Problem3
import java.util.GregorianCalender;


public class Flight {
    //declares flightNo, departureTime, arrivalTime
    private String flightNo;
    private GregorianCalender departureTime;
    private GregorianCalender arrivalTime;


    //Flight consturctor
    public Flight (String flightNo, GregorianCalender departureTime, GregorianCalender arrivalTime){
        this.flightNo=flightNo;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
    }

    //getter for flightNo
    public String getflightNo(){
        return flightNo;
    }
    //getter for departureTime
    public GregorianCalender getDepartureTime(){
        return departureTime;
    }
    //getter for arrivalTime
    public GregorianCalender getArrivalTime(){
        return arrivalTime;
    }
    //setter for departureTime
    public void setDepartureTime(GregorianCalender departureTime){
        this.departureTime=departureTime;
    }

    //setter for arrivalTime
    public void setArrivalTime(GregorianCalender arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    //returns the time of flight in minutes
    public int getFlightTime(){
        ZonedDateTime zdt1 = departureTime.toZonedDateTime() ;
        ZonedDateTime zdt2 = arrivalTime.toZonedDateTime() ;
        return (zdt2.getDayOfYear()*24*60+zdt2.getHour()*60+zdt2.getMinute())-(zdt2.getDayOfYear()*24*60+zdt1.getHour()*60+zdt1.getMinute());
        }

    }
