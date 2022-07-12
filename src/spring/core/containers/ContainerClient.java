package spring.core.containers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.beans.Customer;

public class ContainerClient {
	
	public static void main(String[] args) {
		
		/*//BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml")); // BeanFactory activated
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("D://springxml/spring1.xml"));
		System.out.println("BeanFactory Container activated...");
		
		Customer customer=(Customer)beanFactory.getBean("cust"); // Customer Instantiated
		//Customer customer=beanFactory.getBean(Customer.class);
		
		System.out.println(customer);*/
		
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");//ApplicationContext activated and Customer Instantiated
		
		//ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D://springxml/spring1.xml");
		System.out.println("ApplicationContext Container activated...");
		
		Customer customer=(Customer)applicationContext.getBean("cust");
		//Customer customer=applicationContext.getBean(Customer.class);
		System.out.println(customer);
		
		
		
		
	}

}
