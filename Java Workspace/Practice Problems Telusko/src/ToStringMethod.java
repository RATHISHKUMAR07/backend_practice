public class ToStringMethod
{
	public static void main(String[] args)
	{
		Student s1 = new Student(36,"Rathish");
		System.out.println(s1);
		
	}
}
class Student{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Student(int rollno, String name)
	 {  
	 this.rollno=rollno;  
	 this.name=name;  
	 }  
	   
	 public String toString()
	 {//overriding the toString() method  
	  return rollno+" "+name;  
	 }  
}