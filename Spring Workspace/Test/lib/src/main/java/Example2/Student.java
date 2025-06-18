package Example2;

public class Student {
	private int rollNo;
	private String name;
	private String place;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String plc) {
		place = plc;
	}
	
	public void showDetails() {
		System.out.println("Roll No : " + rollNo + "\nName : "+name+"\nPlace : "+place);
	}
}
