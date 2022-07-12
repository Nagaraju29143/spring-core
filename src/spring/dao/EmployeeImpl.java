package spring.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository("emp")
public class EmployeeImpl implements Employee {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	

	/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/

	public EmployeeDto getEmployeeById(int empId) {
		
		EmployeeDto emp=null;
		
		/*String sql = "select * from emp where empno=?";
		SqlRowSet rs = jdbcTemplate.queryForRowSet(sql, empId);*/
		
		String sql = "select * from emp where empno=:eno";
		
		Map<String,Object> paramsMap=new HashMap<>();
		paramsMap.put("eno",empId);
		
		SqlRowSet rs =namedParameterJdbcTemplate.queryForRowSet(sql,paramsMap);
		

		while (rs.next()) {
			
			emp=new EmployeeDto(rs.getInt("empno"),rs.getString("ename"),rs.getString("job"),rs.getInt("mgr"),rs.getDate("hiredate"),rs.getDouble("sal"),rs.getDouble("comm"),rs.getInt("deptno"));
			
		}
		
		return emp;
	}

	public List<EmployeeDto> getAllEmplyees() {
		List<EmployeeDto> empList=new ArrayList<>();
		
		EmployeeDto emp=null;
		
		/*String sql = "select * from emp";
		SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);*/
		
		String sql = "select * from emp";
		SqlRowSet rs = namedParameterJdbcTemplate.queryForRowSet(sql,new HashMap());

		while (rs.next()) {
			
			emp=new EmployeeDto(rs.getInt("empno"),rs.getString("ename"),rs.getString("job"),rs.getInt("mgr"),rs.getDate("hiredate"),rs.getDouble("sal"),rs.getDouble("comm"),rs.getInt("deptno"));
			
			empList.add(emp);
		}
		
		 /*String sql= "select * from emp";
		 RowMapper<EmployeeDto> rowMapper = new EmployeeRowMapper();
		 List<EmployeeDto> empList=namedParameterJdbcTemplate.query(sql, rowMapper);*/
		
		return empList;
	}

	public int saveEmployee(EmployeeDto emp) {

		/*String sql = "insert into emp(empno,ename,job,sal,deptno) values(?,?,?,?,?)";

		int res = jdbcTemplate.update(sql, emp.getEmpno(),emp.getEname(), emp.getJob(),emp.getSal(),emp.getDeptno());*/
		
		String sql = "insert into emp(empno,ename,job,sal,deptno) values(:eno,:ename,:ejob,:esal,:edeptno)";
		
		Map<String,Object> paramsMap=new HashMap<>();
		paramsMap.put("eno",emp.getEmpno());
		paramsMap.put("edeptno",emp.getDeptno());
		paramsMap.put("ename",emp.getEname());
		paramsMap.put("esal",emp.getSal());
		paramsMap.put("ejob",emp.getJob());
		
		

		int res = namedParameterJdbcTemplate.update(sql,paramsMap);

		if (res > 0) {
			System.out.println("Employee saved");
		} else {
			System.out.println("Employee not inserted");
		}
		
		return res;

	}

	public int updateEmployee(EmployeeDto emp) {

		/*String sql = "update emp set job=?,sal=? where empno=?";

		//int res = jdbcTemplate.update(sql, "MANAGER", 3000, 7499);
		int res = jdbcTemplate.update(sql,emp.getJob(),emp.getSal(),emp.getEmpno());*/
		
		String sql = "update emp set job=:ejob,sal=:esal where empno=:eno";
		
		Map<String,Object> paramsMap=new HashMap<>();
		paramsMap.put("eno",emp.getEmpno());
		paramsMap.put("ejob",emp.getJob());
		paramsMap.put("esal",emp.getSal());

		int res = namedParameterJdbcTemplate.update(sql,paramsMap);

		if (res > 0) {
			System.out.println("Employee updated");
		} else {
			System.out.println("Employee not updated");
		}
      
		return res;
	}
	
	public int deleteEmployee(int empId) {

		String sql = "delete from emp where empno=?";

		int res = jdbcTemplate.update(sql,empId);

		if (res > 0) {
			System.out.println("Employee deleted");
		} else {
			System.out.println("Employee not deleted");
		}

		return res;
	}
	
	

}
