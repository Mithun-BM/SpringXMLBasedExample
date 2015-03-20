package com.example.classes;


public class Manager {

	private String mfirstName;
	private String mmiddleName;
	private String mlastName;
	private Employee emp;

	public String getMfirstName() {
		return mfirstName;
	}

	public void setMfirstName(String mfirstName) {
		this.mfirstName = mfirstName;
	}

	public String getMmiddleName() {
		return mmiddleName;
	}

	public void setMmiddleName(String mmiddleName) {
		this.mmiddleName = mmiddleName;
	}

	public String getMlastName() {
		return mlastName;
	}

	public void setMlastName(String mlastName) {
		this.mlastName = mlastName;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
}
