package com.zzz.jdk;

public class TestServiceClient {
	public static void main(String[] args) {
		DoerService ds = new DoerService();
		IDoer doer = ds.getDoerPort();
		System.out.println(doer.doSth("job!"));
	}
}
