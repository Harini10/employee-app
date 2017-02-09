package com.revature.empapp.testconnection;

import com.revature.empapp.dao.EmployeeDao;
import com.revature.empapp.model.Employee;

public class TestEmployeeDao {

	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setId(3);
		e.setName("ddd");
		e.setDesignation("ceo");
		
		EmployeeDao ted=new EmployeeDao();
		 ted.save(e);
	}
		
		
	}

