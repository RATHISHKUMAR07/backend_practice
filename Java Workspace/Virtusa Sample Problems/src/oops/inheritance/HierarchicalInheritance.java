package oops.inheritance;

class College1{
	String college = "BIT";
}

class Student1 extends College1{
	void getStudentDetails(String name, int id) {
		System.out.println(id + " " + name + " " + super.college);
	}
}

class Professors extends College1{
	void getProfessorDetails(String name, int id) {
		System.out.println(id + " " + name + " " + this.college);
	}
}

public class HierarchicalInheritance {
	public static  void main(String args[]) {
		Professors p = new Professors();
		Student1 s1 = new Student1();
		
		p.getProfessorDetails("Naveen",10);
		s1.getStudentDetails("Rathish", 1);
	}
}
