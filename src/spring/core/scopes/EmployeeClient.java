package spring.core.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	
public static void main(String[] args) {
		
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employee.xml");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/core/scopes/employee.xml");
		
		/*Employee employee=(Employee)applicationContext.getBean("emp");
		System.out.println(employee);*/
		
		/*Employee e1=(Employee)applicationContext.getBean("emp");
		Employee e2=(Employee)applicationContext.getBean("emp");
		Employee e3=(Employee)applicationContext.getBean("emp");
		Employee e4=(Employee)applicationContext.getBean("emp");
		
		System.out.println(e1==e2);
		System.out.println(e3==e4);
		
		Address a1=(Address)applicationContext.getBean("addr");
		Address a2=(Address)applicationContext.getBean("addr");
		Address a3=(Address)applicationContext.getBean("addr");
		Address a4=(Address)applicationContext.getBean("addr");
		
		System.out.println(a1==a2);
		System.out.println(a3==a4);*/
		
		
		Employee employee1=(Employee)applicationContext.getBean("emp");
		Address address1=employee1.getAddress();
		
		Employee employee2=(Employee)applicationContext.getBean("emp");
		Address address2=employee2.getAddress();
		
		System.out.println(address1==address2);
		
	}
}
