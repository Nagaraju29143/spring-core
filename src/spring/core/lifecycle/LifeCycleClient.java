package spring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LifeCycleClient {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring/core/lifecycle/lifecycle.xml");
		
		Employee employee=(Employee)context.getBean("employee");
		
		System.out.println(employee);
		
		context.registerShutdownHook();
	}

}
