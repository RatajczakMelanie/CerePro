package com.cerepro.web.dao;

import java.sql.*;
import com.cerepro.web.model.Employee;

public class EmployeeDao {
	public Employee getEmployees(int id) {
		Employee a = new Employee();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localthost:3306/urlaubsplaner", "root", "root");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees where id =" + id);
			if (rs.next()) {
				a.setId(rs.getInt("id"));
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
