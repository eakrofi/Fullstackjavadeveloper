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

import com.bean.Subject;
import com.bean.Teacher;
import com.dao.SubjectDao;
import com.dao.TeacherDao;
import com.resource.DbConnection;

/**
 * Servlet implementation class SubjectController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Subject> listSubject=null;
		try {
			listSubject = SubjectDao.list();
			System.out.println("here");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("allSubjects", listSubject);
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
			"insert into subject(name,teacher_id) values(?,?)");

			pstmt.setString(1, request.getParameter("name"));
			pstmt.setInt(2, Integer.parseInt(request.getParameter("teacher_id")));

			response.setContentType("text/html");
			pw.println("Added "+pstmt.executeUpdate()+"subject");
			rd = request.getRequestDispatcher("home.jsp");
			rd.include(request, response);
			
		
		}catch(SQLException ex) {
		ex.printStackTrace();
		}
	
	}

}
