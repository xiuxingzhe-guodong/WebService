package com.zzz.rest;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
public class Student {
	@FormParam("id")
	int id;
	@FormParam("name")
	String name;
	@FormParam("sclass")
	String sClass;
	public Student() {
	}
	public Student(int id, String name, String sClass) {
		super();
		this.id = id;
		this.name = name;
		this.sClass = sClass;
	}
}
