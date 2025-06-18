package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	int id;
	String name;
	int age;

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class ComparatorClass1 {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101,"Rathish", 23));
		emp.add(new Employee(102,"Naveen", 25));
		emp.add(new Employee(103,"Nishanth", 14));
		
		Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
		Collections.sort(emp, nameComparator);
		System.out.println("Sort by Name");
		
		emp.stream().forEach(x -> System.out.println(x.getId() + " " + x.getName() + " " + x.getAge()));
		
		Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);
		Collections.sort(emp,ageComparator);
		System.out.println("Sort by Age");
		
		emp.stream().forEach(x -> System.out.println(x.getId() + " " + x.getName() + " " + x.getAge()));

		

	}

}
