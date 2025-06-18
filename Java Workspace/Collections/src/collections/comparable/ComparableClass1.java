package collections.comparable;

import java.util.ArrayList;
import java.util.Collections;


class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public int compareTo(Employee st) {
		if(id == st.id) {
			return 0;
		}
		else if(id > st.id) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	
}



public class ComparableClass1 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(101,"Rathish", 23));
		al.add(new Employee(102,"Naveen", 25));
		al.add(new Employee(103,"Nishanth", 14));
		
		Collections.sort(al);
		
		for(Employee st:al){  
			System.out.println(st.id+" "+st.name+" "+st.age);  
		}  
	}

}
