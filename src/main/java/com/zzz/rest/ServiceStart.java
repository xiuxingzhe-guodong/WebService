package com.zzz.rest;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class ServiceStart {
	public static void main(String[] args) {
		JaxWsServerFactoryBean jwsfb = new JaxWsServerFactoryBean();
		jwsfb.setAddress("http://localhost:13577/rest");
		jwsfb.setServiceClass(StudentService.class);
		jwsfb.setServiceBean(new StudentServiceImpl());
		Server s = jwsfb.create();
		s.start();
		System.out.println(">>>learning service is serving!");
	}
}
