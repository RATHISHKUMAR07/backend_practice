package oops.abstractraction;

interface Student {
    // Abstract method to get student details
    void getDetails();
}

// Concrete class implementing the Student interface
class CollegeStudent implements Student {
    private String name;
    private int rollNumber;

    // Constructor
    public CollegeStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Implementing the abstract method from the interface
    @Override
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        // Other student details can be added here
    }
}

public class InterfaceAbstraction  {
    public static void main(String[] args) {
        // Creating an object of CollegeStudent
        Student student = new CollegeStudent("John Doe", 12345);
        
        // Calling the method defined in the interface
        student.getDetails();
    }
}
