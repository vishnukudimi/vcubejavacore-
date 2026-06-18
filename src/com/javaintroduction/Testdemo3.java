package com.javaintroduction;

public class Testdemo3 {
	// static methods
	static void v() {
		System.out.println("static method 1 ");
		v1();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		v();
	}

	static void v1() {
		System.out.println("static method 2 ");
		v2();
	}

	static void v2() {
		System.out.println("static method 3");
		System.out.println("================");
		Testdemo3 inst = new Testdemo3();
		inst.k();	}
//instance methods
	void k() {
		System.out.println("instance method 1");
		k1();
	}
	void k1() {
		System.out.println("instance method 2");
		k2();
	}
	
	void k2() {
		System.out.println("instance method 3");
		System.out.println("================");
	}
}
