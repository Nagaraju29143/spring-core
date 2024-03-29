package spring.core.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {
	
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		System.out.println("Employee instantiated using default constuctor");
	}

	public Employee(int empId, String empName, double salary) {
		System.out.println("constructor injection performed...");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void setEmpId(int empId) {
		System.out.println("setter injection performed...");
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void setBeanName(String arg0) {
		System.out.println("BeanNameAware invoked.... ");
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("BeanFactoryAware invoked.... ");
		
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("ApplicationContextAware invoked.... ");
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean's afterPropertiesSet() invoked... ");
	}
	
	void myInit() {
		System.out.println("custom init method invoked... ");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean's destroy() invoked... ");		
	}
	
	void myDestroy() {
		System.out.println("custom destroy method invoked... ");
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	

	

	
	





}
