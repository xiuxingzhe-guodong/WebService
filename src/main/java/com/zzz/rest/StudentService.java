package com.zzz.rest;

import javax.jws.WebService;

@WebService
public interface StudentService {
	Student getStudentById(int id);
	void addStudent(Student s);
}
