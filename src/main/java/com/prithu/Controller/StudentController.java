package com.prithu.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.prithu.dao.StudentDao;
import com.prithu.dao.StudentdaoImpl;
import com.prithu.model.Student;
import com.prithu.util.Dbutil;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String STUDENT_LIST = "studentDetails.jsp";
	private static final String STUDENT_NEW = "studentForm.jsp";
	StudentDao studentdao = new StudentdaoImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student student = new Student();
		student.setStudentName(request.getParameter("sname"));
		student.setCollegeName(request.getParameter("cname"));
		student.setEmail(request.getParameter("email"));

		studentdao.saveStudentinfo(student);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("actions");
		String forward = "";
		if (action.equals("student_new")) {
			forward = STUDENT_NEW;
		} else if (action.equals("student_Edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			forward = STUDENT_NEW;
		} else if (action.equals("student_delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			studentdao.deleteStudentInfo(id);
			request.setAttribute("students", studentdao.getStudentInfo());
			forward = STUDENT_LIST;
		} else if (action.equals("student_list")) {

			request.setAttribute("students", studentdao.getStudentInfo());
			forward = STUDENT_LIST;
		}

		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

}
