package Example10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext c = new ClassPathXmlApplicationContext("xmlDetails1.xml");
		
		Employee emp = (Employee)c.getBean("Emp");
		emp.showInfo();
	}
}
