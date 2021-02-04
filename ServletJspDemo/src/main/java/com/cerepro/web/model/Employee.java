package com.cerepro.web.model;

//import java.sql.Date;

public class Employee {
	private int id;
	private String name;

//private String password;
//private int vacationDays;
//private Date vacationStart;
//private Date vacationEnd;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public String getPassword() { return password; } public void
	 * setPassword(String password) { this.password = password; } public int
	 * getVacationDays() { return vacationDays; } public void setVacationDays(int
	 * vacationDays) { this.vacationDays = vacationDays; }
	 * 
	 * public Date getVacationStart() { return vacationStart; } public void
	 * setVacationStart(Date vacationStart) { this.vacationStart = vacationStart; }
	 * public Date getVacationEnd() { return vacationEnd; } public void
	 * setVacationEnd(Date vacationEnd) { this.vacationEnd = vacationEnd; }
	 */
	@Override
	public String toString() {
		return "Employee [ id =" + id + " name=" + name
				+ /*
					 * , password=" + password + ", vacationDays=" + vacationDays + ",
					 * vacationStart=" + vacationStart + ", vacationEnd=" + vacationEnd +
					 */"]";
	}

}
