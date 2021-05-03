//Amanda Poor
//Prof. Arias
//Software Development 1

//uses the Flight and Itinerary class to run the following program about 
//flight departure and arrival times

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class hw8Problem3 {
    
    public static void main(String[] args) {

        ArrayList<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight("US230",
           new GregorianCalendar(2014, 4, 5, 5, 5, 0),
           new GregorianCalendar(2014, 4, 5, 6, 15, 0)));

        flights.add(new Flight("US235",
           new GregorianCalendar(2014, 4, 5, 6, 55, 0),
           new GregorianCalendar(2014, 4, 5, 7, 45, 0)));

        flights.add(new Flight("US237",
           new GregorianCalendar(2014, 4, 5, 9, 35, 0),
           new GregorianCalendar(2014, 4, 5, 12, 55, 0)));

        Itinerary itinerary = new Itinerary(flights);
        
        System.out.println(itinerary.getTotalFlightTime()+ " minutes");
        System.out.println(itinerary.getTotalTravelTime()+ " minutes");
    }
}
