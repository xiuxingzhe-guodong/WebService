package com.zzz.jdk;

import javax.xml.ws.Endpoint;

public class TestService {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:13579/doer", new Doer());
	}
}
