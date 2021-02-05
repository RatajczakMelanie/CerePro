package com.cerepro.web;

import java.io.IOException;
import java.sql.Date;

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
		String password = request.getParameter("password");
		EmployeeDao dao = new EmployeeDao();
		Employee a1 =dao.getEmployees(id, password);
		// new Employee();

		HttpSession session = request.getSession();
		session.setAttribute("employee", a1);
		response.sendRedirect("showEmployee.jsp");
	}
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Date vacationStart =request.getParameter("vacationStart");
		Date vacationEnd =request.getParameter("vacationEnd");
		//String password = request.getParameter("password");
        EmployeeDao dao = new EmployeeDao();
        Employee a2= dao.setEmployees(id,vacationStart,vacationEnd);

        if (a2 != null) {
            request.getSession().setAttribute("vacationStart", vacationStart);
            request.getSession().setAttribute("vacationEnd", vacationEnd);
            response.sendRedirect("showEmployee.jsp");
        }
        else {
            request.setAttribute("error", "Unknown user, please try again");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
	}*/

	
	
	

}
