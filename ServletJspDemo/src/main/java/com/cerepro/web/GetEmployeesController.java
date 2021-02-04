package com.cerepro.web;

import java.io.IOException;

import com.cerepro.web.dao.EmployeeDao;
import com.cerepro.web.model.Employee;

import javax.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class GetEmployeesController
 */
public class GetEmployeesController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDao dao = new EmployeeDao();
		Employee a1 = dao.getEmployees(id);
		// new Employee();

		HttpSession session = request.getSession();
		session.setAttribute("employee", a1);

		response.sendRedirect("showEmployee.jsp");
	}

}
