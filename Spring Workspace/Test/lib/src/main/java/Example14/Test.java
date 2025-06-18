package Example14;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("xmlDetails2.xml");
		
		Question q = (Question)con.getBean("Q1");
		q.show();
	}
}
