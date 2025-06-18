package railway;
import java.util.ArrayList;
import java.util.List;

class Train{
	private String tNo;
	private String tName;
	private int totalSeats;
	private int availableSeats;
	private List<Passenger> passengers;
	
	Train(String tNo,String tName,int totalSeats){
		this.tNo = tNo;
		this.tName = tName;
		this.totalSeats = totalSeats;
		this.availableSeats = totalSeats;
		this.passengers = new ArrayList<>();
	}
	
	public String getTNo() {
		return tNo;
	}
	
	public String getTName() {
		return tName;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public boolean bookTicket(Passenger passenger) {
		if(availableSeats > 0) {
			passengers.add(passenger);
			availableSeats--;
			
			return true;			
		}
		return false;
	}
	
	public boolean cancelTicket(Passenger passenger) {
		if(passengers.remove(passenger)) {
			availableSeats++;
			return true;
		}
		return false;
	}
	
	public int getAvailableSeats() {
		return availableSeats;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
}