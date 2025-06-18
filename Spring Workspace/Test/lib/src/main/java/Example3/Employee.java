package Example3;

public class Employee {
	private int empNo;
	private String name;
	
	Employee(){
		System.out.println("Default Constructor");
	}
	public Employee(int empNo) {
		this.empNo = empNo;
	}
	public Employee(String name) {
		this.name = name;
	}
	public Employee(int empNo,String name)
	{
		this.empNo = empNo;
		this.name = name;
	}
	void showDetails() {
		System.out.println("Employee No : "+empNo+"\nName : "+name);
	}
	
}
