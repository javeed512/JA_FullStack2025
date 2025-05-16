package com.hexaware.web;

import java.io.IOException;
import java.io.PrintWriter;

import com.hexaware.entity.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			PrintWriter out =	 response.getWriter();
		
					response.setContentType("text/html");
			
				out.print("<h1>Welcome to Employee Servlet</h1>");
				
			String   id =		request.getParameter("eid");
			String ename =   	request.getParameter("ename");
			String sal =		request.getParameter("salary");
				
				
			
			
				Employee  emp = new Employee();
				  emp.setEid(Integer.parseInt(id));
				  emp.setEname(ename);
				  emp.setSalary(Double.parseDouble(sal));
				  
				  out.print(emp);
				  
				  
				ServletContext  application =  	request.getServletContext();
				
				application.setAttribute("city", "hyderabad");
				  
				  
				  HttpSession session =		request.getSession();
						  
						  out.print("<br>employee session "+session);
				  
				     session.setAttribute("e1", emp);
				  
				  
				  // service.addEmp(emp);    // -----> repo.addEmp(emp)  ---> jdbc code insert(eid,ename,salary)
				
			RequestDispatcher  rd =	   request.getRequestDispatcher("DisplayServlet");
			
					//rd.forward(request, response);
			
				  rd.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
