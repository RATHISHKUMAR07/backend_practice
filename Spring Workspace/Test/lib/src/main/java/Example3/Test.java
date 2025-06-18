package Example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//Using Constructor Injection
		ApplicationContext context = new ClassPathXmlApplicationContext("xml2.xml");
		//To print Employee No and Name using Constructor
		Employee employee = (Employee)context.getBean("consInject");
		employee.showDetails();
		
		//To print Employee No using Constructor
		Employee employee1 = (Employee)context.getBean("consInject1");
		employee1.showDetails();
		
		//To print Name using Constructor
		Employee employee2 = (Employee)context.getBean("consInject2");
		employee2.showDetails();		
	}

}
