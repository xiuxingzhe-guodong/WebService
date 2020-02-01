package com.zzz.jdk;

import javax.jws.WebService;

@WebService(endpointInterface = "com.zzz.jdk.IDoer")
public class Doer implements IDoer{

	@Override
	public String doSth(String thing) {
		return "I'm doing " + thing;
	}
	
}
