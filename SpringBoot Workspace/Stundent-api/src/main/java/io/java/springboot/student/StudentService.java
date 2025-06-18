package io.java.springboot.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private List<Student> students = new ArrayList<>(Arrays.asList(
			new Student("101","Rathish","BIT","CT","9.01"),
			new Student("102","Sanjai","BIT","ECE","8.75"),
			new Student("103","Sanjay","BIT","IT","8.93")
			));
	
	public List<Student> getAllStudents(){
		return students;
	}
	
	public Student getStudent(String rollNo) {
		return students.stream().filter(t -> t.getRollNo().equals(rollNo)).findFirst().get();
	}

	public void addStudent(Student student) {
		students.add(student);		
	}
	
	public void updateStudent(Student student,String rollNo) {
		for(int i=0;i<students.size();i++) {
			Student t = students.get(i);
			if(t.getRollNo().equals(rollNo)) {
				students.set(i,student);
				return;
			}
		}
	}

	public void deleteStudent(String rollNo) {
		students.removeIf(t -> t.getRollNo().equals(rollNo));
	}
}
