package com.zzz.cxf;

public class Learn implements ILearn {

	@Override
	public String learning(String tech) {
		return "We are learning "+ tech;
	}

}
