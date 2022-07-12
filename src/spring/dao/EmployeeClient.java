package spring.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeClient {
	
	

	public static void main(String[] args) {
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/dao/employee.xml");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		EmployeeImpl empObj=(EmployeeImpl)applicationContext.getBean("emp");
	    
	    //System.out.println(empObj.getEmployeeById(7839));
	    System.out.println(empObj.getAllEmplyees());
		
		/*EmployeeDto emp=new EmployeeDto();
		emp.setEmpno(7499);
		emp.setEname("ALLEN");
		emp.setJob("SALESMAN");
		emp.setSal(1600);
		emp.setDeptno(30);
		
		System.out.println(empObj.saveEmployee(emp));*/
		
		/*EmployeeDto emp=new EmployeeDto();
		emp.setEmpno(7499);
		emp.setJob("MANAGER");
		emp.setSal(3000);
		
		System.out.println(empObj.updateEmployee(emp));*/
		
		//System.out.println(empObj.deleteEmployee(7499));
		
		
		//empObj.getAllEmplyees();
		//empObj.saveEmployee();
	    //empObj.updateEmployee();
		//empObj.deleteEmployee();
		
	
		
	}
	
	 
 }
	
	
	

  