package com.mk.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.dao.TestDao;
import com.mk.po.Student;
import com.mk.service.TestService;

@Service(value = "testService")
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;
	
	
	public List<Student> getStudents(){
		return testDao.getStudents();
		
	}
}
