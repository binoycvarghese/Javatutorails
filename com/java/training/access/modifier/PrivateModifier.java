package com.java.training.access.modifier;

public class PrivateModifier {

	private String name = "private";

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	


}

class PrivateSubClazz extends PrivateModifier{
	void test() {
		//System.out.println(get);
	}
}

