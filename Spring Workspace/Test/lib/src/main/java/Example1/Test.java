package Example1;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Test {
	public static void main(String args[]) {
		//Using BeanFactory IOC
		Resource resource = new ClassPathResource("xml1.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student student = (Student)factory.getBean("Student1");
		student.displayDetails();
	}
	
}
