package com.test;

import org.apache.log4j.Logger;

public class Test {
	static Logger logger = Logger.getLogger(Test.class);

	public static void main(String[] args) {
		logger.info("loging....");
		Employee employee = new Employee("45", "sekhar", "5000");
		EmployeeDB.add(employee);
		System.out.println(EmployeeDB.get("45"));
	}

}
