package Example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml4.xml");
		
		Question q = (Question)context.getBean("qBean");
		q.showDetails(); 
	}

}
