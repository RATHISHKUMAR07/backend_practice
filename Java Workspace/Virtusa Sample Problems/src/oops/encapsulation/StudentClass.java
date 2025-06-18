package oops.encapsulation;
class Student{
	private String name;
	private String college;
	Student(String name){
		this.name = name;
	}
	Student(String name, String college){
		this.name = name;
		this.college = college;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getCollege() {
		return college;
	}
	void setCollege(String college) {
		this.college = college;
	}
}
public class StudentClass {
	public static void main(String[] args) {
			Student s = new Student("Rathish");
			System.out.println("Cons 1 - " + s.getName());
			s = new Student("Rathish", "BIT");
			System.out.println("Cons 1 - " + s.getName() + " " + s.getCollege());

			
			
	}

}
