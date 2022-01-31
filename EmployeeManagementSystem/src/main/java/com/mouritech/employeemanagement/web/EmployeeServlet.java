package com.mouritech.employeemanagement.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mouritech.employeemanagement.dao.EmployeeDao;
import com.mouritech.employeemanagement.entity.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao empDao;

	public void init() {
		empDao = new EmployeeDao();
	}
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(req, resp);
		}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getServletPath();

		try {

			switch (action) {
			case "/new":
				showNewEmployeeForm(req,resp);
				break;
			case "/insert":
				insertEmployee(req,resp);
				break;
			case "/list":
				listEmployee(req,resp);
				break;
			case "/update":
					updateEmployee(req,resp);
				break;
			case "/edit":
					
				break;
			case "/delete":
				deleteEmployee(req,resp);
				break;
			default:
				break;
			}//close of switch

		} catch (Exception e) {
			e.printStackTrace();
		}//close catch
		
	}//close of doPost
	
	private void updateEmployee(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	private void deleteEmployee(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Long empid = (long) Integer.parseInt(req.getParameter("id"));
		empDao.deleteEmployee(empid);
		resp.sendRedirect("list");
		
	}

	private void insertEmployee(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//Long empid =      (long) Integer.parseInt(req.getParameter("eid"));
		String empname = req.getParameter("ename");
		String empemail = req.getParameter("eemail");
		String empmobno = req.getParameter("emobno");
		
		Employee emp = new Employee(empname,empemail,empmobno);
		empDao.saveEmployee(emp);
		resp.sendRedirect("list");
		
	}

	private void showNewEmployeeForm(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("employee-form.jsp");
		rd.forward(req, resp);
		
	}

	private void listEmployee(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException, IOException ,SQLException {
		
		List<Employee> listOfEmployees  = empDao.getAllEmployees();
		req.setAttribute("listEmp",listOfEmployees );
		RequestDispatcher rd = req.getRequestDispatcher("employee-list.jsp");
		rd.forward(req, res);
	}

}
