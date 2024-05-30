package in.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Springioc.xml");
	     Car car=context.getBean(Car.class);
	     car.driver();
	
	}

}
