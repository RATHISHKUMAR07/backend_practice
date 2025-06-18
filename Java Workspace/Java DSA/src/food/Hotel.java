package food;
import java.util.*;
public class Hotel {
	private String hotelName;
	private Map<String,FoodItem> menu;
	public Hotel(String hotelName) {
		super();
		this.hotelName = hotelName;
		this.menu = new HashMap<>();
	}
	 public void addToMenu(String itemName, double itemPrice) {
	        menu.put(itemName, new FoodItem(itemName, itemPrice));
	    }
	public String getHotelName() {
		return hotelName;
	}
	 public Map<String, FoodItem> getMenu() {
	        return menu;
	  }
	 void viewMenu() {
//		 Iterator<Hotel> itr = menu.iterator();
//			for(String hotel : menu) {
//				if(hotel.equals(hotelName)) {
//					System.out.println();
//				}
//			}
		}
		
}
