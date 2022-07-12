package spring.core.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireClient {

	public static void main(String[] args) {

       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/core/autowire/autowire.xml");
		
		Customer cust=(Customer)applicationContext.getBean("customer");
		System.out.println(cust);
	}

}
