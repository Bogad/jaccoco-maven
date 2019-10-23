package org.example;

public class A {

	public void foo() {
		System.out.println("A  fooo");
	}

	public void bar() {
		System.out.println("B  fooo");
	}

	public void vulnerability() {
		String nullValue = null;
		nullValue.substring(1);
		String a = "a";
		String b = "b";
		if (a == b) {
			System.out.println("What!!");
		}
	}
}
