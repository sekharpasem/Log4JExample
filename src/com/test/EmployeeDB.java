package com.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * 
 * @author Shekar
 *
 */
public class EmployeeDB {
	static Logger logger = Logger.getLogger(EmployeeDB.class);
	private static Map<String, Employee> map = new HashMap<String, Employee>();

	/**
	 * 
	 * @param employee
	 */
	static void add(Employee employee) {
		logger.info("add employee");
		map.put(employee.getId(), employee);

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	static Employee get(String id) {
		logger.info("get employee");
		return map.get(id);

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	static Employee remove(String id) {
		logger.info("remove employee");
		return map.remove(id);

	}

}
