package com.univ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dept_table")
public class Department {
	
	@Id
	private int did;
	@Column(name = "dept")
	private String department;
	
	@ManyToOne //(mappeBY)
	private Employe emp;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String department, Employe emp) {
		super();
		this.did = did;
		this.department = department;
		this.emp = emp;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employe getEmp() {
		return emp;
	}

	public void setEmp(Employe emp) {
		this.emp = emp;
	}
	
}
