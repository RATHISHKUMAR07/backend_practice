package oops.inheritance;
class College{
	String college = "BIT";
	void getCollege() {
		System.out.println(college);
	}
}
class Department extends College{
	String department = "CT";
	void getDepartment() {
		System.out.println(department);
	}
	void getDepartment(String dept) {
		System.out.println(dept);
	}
}
class Student extends Department{
	String name = "rathish";
	void getName() {
		System.out.println(name);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Student s = new Student();
		s.getName();
		s.getDepartment();
		s.getDepartment("CSE");
		s.getCollege();
	}

}
