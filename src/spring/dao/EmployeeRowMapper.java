package spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class EmployeeRowMapper implements RowMapper<EmployeeDto> {

	@Override
	public EmployeeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDto emp=new EmployeeDto(rs.getInt("empno"),rs.getString("ename"),rs.getString("job"),rs.getInt("mgr"),rs.getDate("hiredate"),rs.getDouble("sal"),rs.getDouble("comm"),rs.getInt("deptno"));
		
		/*emp.setEmpno(rs.getInt("empno"));
		emp.setEname(rs.getString("ename"));
		emp.setJob(rs.getString("job"));
		emp.setMgr(rs.getInt("mgr"));
		emp.setHiredate(rs.getDate("hiredate"));
		emp.setSal(rs.getDouble("sal"));
		emp.setComm(rs.getDouble("comm"));
		emp.setDeptno(rs.getInt("deptno")); */
		
		return emp;
	}

}
