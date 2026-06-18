package com.javaintroduction;

public class Testdemo4 {

	static void method1() {
		System.out.println("static method1 called");
		method2();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
	}

	static void method2() {
		System.out.println("static method2 called");
		System.out.println("======================= ");
		Testdemo4 t = new Testdemo4();
		t.method3();

	}
//instance method

	void method3() {
		System.out.println("instance method 1 called");
		method4();

	}

	void method4() {
		System.out.println("instance method 2 called");
	}

}
