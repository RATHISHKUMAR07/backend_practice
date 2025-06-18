package Example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		//Using ApplicationContext IOC

		ApplicationContext context = new ClassPathXmlApplicationContext("xml1.xml");
		Student student = (Student)context.getBean("studBean");
		student.showDetails();
	}
}
