package spring.dao;

import java.util.List;

public interface Employee {

	EmployeeDto getEmployeeById(int empId);

	List<EmployeeDto> getAllEmplyees();

	int saveEmployee(EmployeeDto emp);

	int updateEmployee(EmployeeDto emp);

	int deleteEmployee(int empId);

}
