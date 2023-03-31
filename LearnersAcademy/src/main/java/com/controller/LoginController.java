package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String userName = request.getParameter("username");
		//response.getWriter().append(userName);
		String passWord = request.getParameter("password");
		//response.getWriter().append(passWord);
		
		if (userName.equals("akrofi") && passWord.equals("akrofi")) {
			
			//PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			//HttpSession session = request.getSession();
			//session.setAttribute("id", email);
			response.sendRedirect("home.jsp");
			return;
		}
		else {
			response.sendRedirect("index.jsp");
			return;
		}
		
		
	}

}
