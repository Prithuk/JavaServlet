package com.prithu.dao;

import java.util.List;

import com.prithu.model.Student;

public interface StudentDao {
	
	public void saveStudentinfo(Student student); 
	public List<Student> getStudentInfo(); 
	
	public void deleteStudentInfo(int id); 

}
