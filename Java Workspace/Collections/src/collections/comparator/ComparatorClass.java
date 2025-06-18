package collections.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
	}
}

class NameComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}
}

class RollnoComparator extends AgeComparator {

	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.rollno == s2.rollno) {
			return 0;
		} else if (s1.rollno < s2.rollno) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparatorClass {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();

		al.add(new Student(101, "Rathish", 23));
		al.add(new Student(102, "Naveen", 25));
		al.add(new Student(103, "Nishanth", 14));

		System.out.println("Sort by Name");
		Collections.sort(al, new NameComparator());

		Iterator<Student> itr1 = al.iterator();
		while (itr1.hasNext()) {
			Student st = (Student) itr1.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("\nSort by Age");
		Collections.sort(al, new AgeComparator());

		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("\nSort by Rollno");
		Collections.sort(al, new RollnoComparator());

		Iterator<Student> itr3 = al.iterator();
		while (itr3.hasNext()) {
			Student st = (Student) itr3.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
