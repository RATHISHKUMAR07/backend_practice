package railway;

class Passenger{
	private String name;
	private int age;
	private int seat;
	
	Passenger(String name,int age,int seat){
		super();
		this.name = name;
		this.age = age;
		this.seat = seat;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSeat() {
		return seat;
	}
}