package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Student;

@Repository("StudnetDAOimpl1")
public class StudentDaoImpl implements StudentDaoInterface{
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	String query = "SELECT * FROM STUDENTS WHERE STUDNENT_ID = ?";
	public Student getStudnetDetails(String id){		
		
		/*Student s = jdbcTemplate.query(query, new Object[]{id}, new RowMapper<Student>(){			
			public Student mapRow(ResultSet result, int index) throws SQLException {
				Student st=new Student();
				st.setStudentId(result.getString(1));
				return st;				
				}			
				}).get(0);
		return s;		
				*/
		
		Student st=new Student();
		st.setStudentGrade("FirstClass");
		st.setStudentId("st10");
		st.setStudentName("Ravi");
		st.setStudentRollNum("st10");		
		return st;

	}
}
