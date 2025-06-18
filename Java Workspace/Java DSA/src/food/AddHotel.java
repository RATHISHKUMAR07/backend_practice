package food;
import java.util.*;
public class AddHotel {
	ArrayList<String> hotels = new ArrayList<>();
	
	void addHotel(String hotel) {
		if(hotels.contains(hotel)) {
			System.out.println("Hotel Name is already available");
		}
		else {
			hotels.add(hotel);
			System.out.println("Hotel added Successfully "+hotel);
		}
	}
	void viewHotel() {
		if(hotels.size() > 0) {
			for(String name : hotels) {
				System.out.println(name);
			}
		}
	}
		
}
