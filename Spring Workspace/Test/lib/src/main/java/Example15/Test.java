package Example15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("xmlDetails2.xml");
		//Auto wiring in Spring
		A a = (A)con.getBean("a",A.class);
		a.display();
	}

}
