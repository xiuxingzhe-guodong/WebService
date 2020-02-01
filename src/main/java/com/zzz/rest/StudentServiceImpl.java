package com.zzz.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/stds")
public class StudentServiceImpl implements StudentService {
	Map<Integer,Student> m = new HashMap<>();
	@GET
	@Path("/student/{id}")
	@Produces("application/json")//数据格式
	@Override
	public Student getStudentById(int id) {
		if(m.containsKey(id)) {
			System.out.println("found student");
			return m.get(id);
		}
		else {
			System.out.println("student with "+id +" doesn't exist.");
			return null;
		}
			
	}
	@POST
	@Path("/student")
	@Consumes("application/x-www-form-urlencoded")
	@Override
	public void addStudent(Student s) {
		m.put(s.id, s);
		System.out.println("student saved.");
	}
	public StudentServiceImpl() {
		super();
		m.put(1, new Student(1, "Jack", "class 3"));
	}
	

}
