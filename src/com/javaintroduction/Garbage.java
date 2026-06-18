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
		obj2 = null;
	System.out.println(obj1);
	System.out.println(obj2);
	System.out.println(obj3);
	System.gc();;
	}

}
