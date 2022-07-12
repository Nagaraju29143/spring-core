package spring.core.annotation.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationClient {

	public static void main(String[] args) {

       // ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/core/annotation/demo/spring-annotation.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);	
		
		Customer cust=(Customer)applicationContext.getBean("customer");
		System.out.println(cust);
		
		System.out.println(cust.getPostgredbUrl());
		
		CustomerBasicDetails cbd=(CustomerBasicDetails)applicationContext.getBean("cbd");
		System.out.println(cbd);
		
		CustomerAddress ca=(CustomerAddress)applicationContext.getBean("current");
		System.out.println(ca);
		
		CustomerAddress pa=(CustomerAddress)applicationContext.getBean("perminent");
		System.out.println(pa);
	}

}
