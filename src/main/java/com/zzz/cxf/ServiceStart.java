package com.zzz.cxf;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class ServiceStart {
	public static void main(String[] args) {
		JaxWsServerFactoryBean jwsfb = new JaxWsServerFactoryBean();
		jwsfb.setAddress("http://127.0.0.1:13578/learn");
		jwsfb.setServiceClass(ILearn.class);
		jwsfb.setServiceBean(new Learn());
		Server s = jwsfb.create();
		s.start();
		System.out.println(">>>learning service is serving!");
	}
}
