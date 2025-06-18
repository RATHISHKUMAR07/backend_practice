package food;

public class FoodBookingSystem {

	public static void main(String[] args) {
		AddUser add = new AddUser();
		User u1 = new User("Rathish","12345");
		User u2 = new User("Naveen","67890");
		add.addUser(u1);
		add.addUser(u2);
		
		AddHotel add1 = new AddHotel();
		add1.addHotel("KFC");
		add1.addHotel("McDonalds");
		add1.addHotel("KFC");
		add1.viewHotel();

	}

}
