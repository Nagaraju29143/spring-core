package spring.core.scopes;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware{
//public class Employee	{
	//primitive types
	private int empId;
	private String  empName;
	
	//reference type/custom type
	private Address address;
	
   private ApplicationContext ac;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.ac = arg0;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
    
	public Address getAddress() {
		
		//return address;
		return ac.getBean(Address.class);
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

	
	

	

	
}
