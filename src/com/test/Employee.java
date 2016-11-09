package com.test;

/**
 * 
 * @author Shekar
 *
 */
public class Employee {

	private String id;
	private String name;
	private String amount;

	public Employee(String id, String name, String amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAmount() {
		return amount;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}
