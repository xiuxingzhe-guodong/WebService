package com.zzz;

import javax.jws.WebService;

@WebService(endpointInterface = "com.zzz.IDoer")
public class Doer implements IDoer{

	@Override
	public String doSth(String thing) {
		return "I'm doing " + thing;
	}
	
}
