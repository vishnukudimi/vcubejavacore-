package com.javaintroduction;

public class Garbage1 {




		@Override
		protected void finalize() throws Throwable {
	System.out.println("garbage collector working");		
		}
		
		
		

		public static void main(String[] args) {
			Garbage1 obj1 = new Garbage1();
			Garbage1 obj2 = new Garbage1();
			Garbage1 obj3 = new Garbage1();
			obj1 = null;
			obj2 = null;
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.gc();;
		}

	}


