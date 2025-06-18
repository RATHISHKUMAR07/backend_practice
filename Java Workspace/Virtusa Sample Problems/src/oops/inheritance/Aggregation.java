package oops.inheritance;
class Address{
	String city;
	String county;
	int code;
	public Address(String city, String county, int code) {
		super();
		this.city = city;
		this.county = county;
		this.code = code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
}

class Worker{
	int id;
	String name;
	Address address;
	
	public Worker(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}


public class Aggregation {

	public static void main(String[] args) {
		Worker W;
		Address A = new Address("Vellore","TN",1100);
		
		W = new Worker(1,"Rathish", A);
		W = new Worker(1,"Naveen", A);
		System.out.println(W.getId() + " - " + W.getName() + " " + W.getAddress().getCity());
		System.out.println(W.getAddress().getCity()  + " - " + W.getAddress().getCode()  + " - " + W.getAddress().getCounty());
		
		System.out.println(W.getId() + " - " + W.getName() + " " + W.getAddress().getCity());
		System.out.println(W.getAddress().getCity()  + " - " + W.getAddress().getCode()  + " - " + W.getAddress().getCounty());

	}

}
