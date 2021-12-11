package com.prithu.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.prithu.model.Student;
import com.prithu.util.Dbutil;

public class StudentdaoImpl implements StudentDao {

	PreparedStatement ps = null;

	@Override
	public void saveStudentinfo(Student student) {
	
		String sql = "insert into student_tbl(student_name,college_name,email) values(?,?,?)";

		try {
			ps = Dbutil.getConnection().prepareStatement(sql);
			ps.setString(1, student.getStudentName());
			ps.setString(2, student.getCollegeName());
			ps.setString(3, student.getEmail());
			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		
		

	}

	@Override
	public List<Student> getStudentInfo() {
		
		String sql = "Select * from student_tbl" ;
		List<Student> studentList = new ArrayList<>();
		try {
			ps = Dbutil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); 
			while(rs.next()) { 
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setStudentName(rs.getString("student_name"));
				student.setCollegeName(rs.getString("college_name"));
				student.setEmail(rs.getString("email"));
				studentList.add(student); 
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		return studentList;
	}

	@Override
	public void deleteStudentInfo(int id) {
		String sql = "Delete from student_tbl where id = ?"; 
		try {
			ps = Dbutil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate(); 
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		
		
	}
	
	

}
