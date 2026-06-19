package com.javaintroduction;

public class Garbage {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("garbage collector working");
	}

	public static void main(String[] args) {
		Garbage obj1 = new Garbage();
		Garbage obj2 = new Garbage();
		Garbage obj3 = new Garbage();
		obj1 = null;
		obj2 = obj3;

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.gc();
		;// with or without this the output will be the same,but why we use this method
			// in the program.

	}

}
