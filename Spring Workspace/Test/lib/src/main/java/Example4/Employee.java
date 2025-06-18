package Example4;

public class Employee {
	private int id;
	private String name;
	private Address address;
	//We are using super() because it will call the constructor
	//otherwise it will call the default constructor
	Employee(int id, String name,Address address){
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void show() {
		System.out.println("ID : "+id+"\nName : "+name);
		System.out.println("Address \n"+address.toString());

	}
}
