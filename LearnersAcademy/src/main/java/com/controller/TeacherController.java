package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Teacher;
import com.dao.TeacherDao;
import com.resource.DbConnection;

/**
 * Servlet implementation class TeacherController
 */
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Teacher> listTeacher=null;
		try {
			listTeacher = TeacherDao.list();
			System.out.println("here");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("allTeachers", listTeacher);
//		RequestDispatcher rd;
//		rd = request.getRequestDispatcher("viewTeacher.jsp");
//		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher rd;
		PrintWriter pw = response.getWriter();
		PreparedStatement pstmt;
		try {
			pstmt = DbConnection.getDbConn().prepareStatement(
			"insert into teacher(name) values(?)");

			pstmt.setString(1, request.getParameter("name"));

			response.setContentType("text/html");
			pw.println("Added "+pstmt.executeUpdate()+" teacher");
			rd = request.getRequestDispatcher("home.jsp");
			rd.include(request, response);
			
		
		}catch(SQLException ex) {
		ex.printStackTrace();
		}
	}
}