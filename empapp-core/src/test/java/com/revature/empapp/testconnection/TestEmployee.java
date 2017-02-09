package com.revature.empapp.testconnection;

import com.revature.empapp.model.Employee;

public class TestEmployee {

	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setId(2);
		e.setName("ccc");
		e.setDesignation("project Head");
		System.out.println(e);
	}
}
