package spring.core.containers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.beans.Customer;
import spring.core.beans.Employee;

public class ContainerClient {
	
	public static void main(String[] args) {
		
		//BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml")); // BeanFactory activated
		/*BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("D://springxml/spring1.xml"));
		System.out.println("BeanFactory Container activated...");
		
		//Customer customer=(Customer)beanFactory.getBean("cust"); // Customer Instantiated
		Customer customer=beanFactory.getBean(Customer.class);
		
		System.out.println(customer);
		System.out.println("Name: "+customer.getName());
		System.out.println("Age: "+customer.getAge());
		System.out.println("Sal: "+customer.getSalary());*/
		
		System.out.println("***************************");
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");//ApplicationContext activated and Customer Instantiated
		
		//ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D://springxml/spring1.xml");
		System.out.println("ApplicationContext Container activated...");
		
		Customer customer=(Customer)applicationContext.getBean("cust");
		/*Customer customer1=applicationContext.getBean(Customer.class);
		Customer customer2=applicationContext.getBean(Customer.class);
		System.out.println(customer1==customer2);
		System.out.println(customer1);*/
		System.out.println("Name: "+customer.getName());
		System.out.println("Age: "+customer.getAge());
		System.out.println("Sal: "+customer.getSalary());
		
	/*	Employee employee1=(Employee)applicationContext.getBean("emp");
		Employee employee2=(Employee)applicationContext.getBean("emp");
		
		System.out.println(employee1==employee2);
		System.out.println(employee1);
		System.out.println("Eid: "+employee1.getEid());
		System.out.println("Ename: "+employee1.getEname());
		System.out.println("Esal: "+ employee1.getEsal());*/
		
		
	}

}
