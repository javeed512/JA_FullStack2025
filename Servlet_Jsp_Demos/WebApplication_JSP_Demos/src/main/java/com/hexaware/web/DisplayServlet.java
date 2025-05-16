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
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DisplayServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");

		out.print("<br>");
		out.print("Welcome to DisplayServlet <br>");

		// out.print(request.getParameter("ename"));

		HttpSession session = request.getSession();

		out.print("<br>display session " + session);

		Employee emp = (Employee) session.getAttribute("e1");

		out.print(emp);

		//session.removeAttribute("e1");

		ServletContext application = request.getServletContext();

		String city = (String) application.getAttribute("city");

		out.print("<br>city : " + city);

		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");

		

		rd.include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
