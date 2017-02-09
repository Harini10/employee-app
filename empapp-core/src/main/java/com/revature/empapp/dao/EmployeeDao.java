package com.revature.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.empapp.model.Employee;
import com.revature.empapp.util.ConnectionUtil;

public class EmployeeDao {

	private JdbcTemplate jt=ConnectionUtil.getJdbcTemplate();
	public void save(Employee e)
	{
		String sql="insert into EMPLOYEE(name,designation) values(?,?)";
			Object[] params={e.getName() , e.getDesignation()};
			int row=jt.update(sql,params);
			System.out.println("num of rows inserted"+row);
		
	}
}
