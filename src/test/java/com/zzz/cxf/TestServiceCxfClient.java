package com.zzz.cxf;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class TestServiceCxfClient {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setAddress("http://127.0.0.1:13578/learn");
		jwpfb.setServiceClass(ILearn.class);
		ILearn l = (ILearn)jwpfb.create();
		System.out.println(l.learning("cxf!"));
		
	}
}
