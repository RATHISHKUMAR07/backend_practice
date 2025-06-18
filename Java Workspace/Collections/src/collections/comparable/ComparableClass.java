package collections.comparable;

import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	
	public int compareTo(Student st) {
		if(age == st.age) {
			return 0;
		}
		else if(age > st.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
}



public class ComparableClass {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(101,"Rathish", 23));
		al.add(new Student(102,"Naveen", 25));
		al.add(new Student(103,"Nishanth", 14));
		
		Collections.sort(al);
		
		for(Student st:al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}

}
