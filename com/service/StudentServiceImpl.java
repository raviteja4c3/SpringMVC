package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Student;
import com.dao.StudentDaoInterface;

@Service("studServiceImpl1")
public class StudentServiceImpl implements StudentServiceInterface {
	
	@Autowired
	@Qualifier("StudnetDAOimpl1")
	private StudentDaoInterface studDAO;
	
	public Student getStudnetDetails(String id){		
		return studDAO.getStudnetDetails(id);
	}
	
	

}
