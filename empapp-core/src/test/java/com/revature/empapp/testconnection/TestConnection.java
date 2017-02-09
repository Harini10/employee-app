package com.revature.empapp.testconnection;

import com.revature.empapp.util.ConnectionUtil;

public class TestConnection {
 
	public static void main(String args[])
	{
		System.out.println(ConnectionUtil.dataSource());
		System.out.println(ConnectionUtil.getJdbcTemplate());
	}

}
