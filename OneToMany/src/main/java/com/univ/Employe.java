package com.univ;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employe {
	
	@Id
	private int eid;
	private String employe;
	
	@OneToMany(mappedBy = "did")      // to remove extra table (extra table not created)
	//@OneToMany
	private List<Department> dept;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int eid, String employe, List<Department> dept) {
		super();
		this.eid = eid;
		this.employe = employe;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmploye() {
		return employe;
	}

	public void setEmploye(String employe) {
		this.employe = employe;
	}

	public List<Department> getDept() {
		return dept;
	}

	public void setDept(List<Department> dept) {
		this.dept = dept;
	}
	
	
}
