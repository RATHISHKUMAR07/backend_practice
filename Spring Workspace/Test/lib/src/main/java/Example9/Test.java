package Example9;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	//xmlDetails1
	public static void main(String args[]) {
		Resource res = new ClassPathResource("xmlDetails1.xml");
		BeanFactory fac = new XmlBeanFactory(res);
		
		Employee employee = (Employee)fac.getBean("emp");
		employee.showDetails();
	}
}
