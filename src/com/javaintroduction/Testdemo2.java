package com.javaintroduction;

public class Testdemo2 {
	static Testdemo2 t = new Testdemo2();
	//static blocl
	static {
		System.out.println("static block called");
	}
	//instance block
	{
		System.out.println("Instance block called");	
	}
	//instance block
	{
		System.out.println("good morning");    
		Testdemo2 t1 = new Testdemo2();            //if we want to repeat the print statements we can use the obj for instance block
		                                           //we can use it for the multiple instance blocks by creating multiple new ojs's
	}
	
public static void main (String [] args) {
	Testdemo2 t = new Testdemo2();
	System.out.println("main method started");
	System.out.println("main method ended");
}
}
