package com.mk.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mk.po.Student;


@Repository
public interface TestDao {
	
	public List<Student> getStudents();
}
