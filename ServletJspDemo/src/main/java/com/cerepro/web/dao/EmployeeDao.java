package com.cerepro.web.dao;

import java.sql.*;
import com.cerepro.web.model.Employee;

public class EmployeeDao {
	public Employee getEmployees(int id, String password) {
		Employee a = new Employee();
        //
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urlaubsplaner", "root", "root");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees where id =" + id + " and password=\'" + password + "\';" );
			if (rs.next()) {
				a.setId(rs.getInt("id"));
				a.setPassword(rs.getString("password"));
				a.setName(rs.getString("name"));

				// a1.setName(rs.getString("name"));
				// a1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return a;
	}
		public Employee setEmployees(int id, Date vacationStart, Date vacationEnd) {
			Employee a = new Employee();
            //
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urlaubsplaner", "root", "root");

				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("update employees set vacationStart=" + vacationStart+ " and vacationEnd="+vacationEnd+"where id =" + id +"';" );
				if (rs.next()) {
					a.setId(rs.getInt("id"));
					a.setPassword(rs.getString("password"));
					a.setName(rs.getString("name"));

					// a1.setName(rs.getString("name"));
					// a1.setPassword(rs.getString("password"));
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		return a;

	}
}
