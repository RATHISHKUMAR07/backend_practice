package railway;
import java.util.List;

public class RailwayResevationSystem {
    public static void main(String[] args) {
        Train train = new Train("12345","Express",50);
        
        int seatNo = 1;
        
        Passenger p1 = new Passenger("Rathish",22 , seatNo++);
        boolean booked = train.bookTicket(p1);
        Passenger p2 = new Passenger("Naveen",22 , seatNo++);
        train.bookTicket(p2);
        if(booked) {
        	System.out.println("Train Ticket Booked "+p1.getName()+" Seat No "+p1.getSeat());;
        }
        else {
        	System.out.println("Failed to Book");
        }
        
        System.out.println("Total Seats "+train.getTotalSeats());;

        System.out.println("Available Seats "+train.getAvailableSeats());;
        
        List<Passenger> passengers = train.getPassengers();
        for(Passenger p : passengers) {
            System.out.println(p.getName() + " - Age: " + p.getAge() + " - Seat: " + p.getSeat());
        }
        
        boolean canceled = train.cancelTicket(p2);
        if(canceled) {
            System.out.println("Ticket canceled for " + p2.getName());
        }
        else {
            System.out.println("Cancellation failed. Passenger not found.");
        }
        
        for(Passenger p : train.getPassengers()) {
            System.out.println(p.getName() + " - Age: " + p.getAge() + " - Seat: " + p.getSeat());
        }
        
    }
}