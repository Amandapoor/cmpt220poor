//Amanda Poor
//Prof. Arias
//Software Development 1

//defines the Itinerary class used in Problem3

import java.time.ZonedDataTime;
import java.util.ArrayList;

public class Itinerary{

    //declares flights
    ArrayList<Flight> flights;

    //contructs Itinerary
    public Itinerary(ArrayList<Flight> flights){
        this.flights = flights;
    }

    //class for sum of all flights
    public int getTotalFlightTime(){
        int totalFlightTime = 0;
        for(int i = 0; i<flights.size(); i++){
            totalFlightTime =totalFlightTime + flights.get(i).getFlightTime();
        }
        return totalFlightTime;
    }
    //first flight departure time - last flight departure time
    public int getTotalTravelTime(){
        ZonedDateTime zdt1 = list.get(0).getDepartureTime().toZonedDateTime();
        ZonedDateTime zdt2 = list.get(list.size()-1).getArrivalTime().toZonedDateTime();
        return (zdt2.getDayOfYear()*24*60+zdt2.getHour()*60+zdt2.getMinute())-(zdt2.getDayOfYear()*24*60+zdt1.getHour()*60+zdt1.getMinute());
    }
}