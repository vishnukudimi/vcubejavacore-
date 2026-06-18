package com.javaintroduction;
// this is the problem where the method is called only once
//but all created method will be called 
//that is 3 instance methods and 3 static methods are called 
public class Testdemo1 {
	static void hello() {
		System.out.println("static method 1");
		hi();
	}
	public static void main (String[]args) {
	

System.out.println("main method started");
hello();

}
	static void hi() {
		System.out.println("static method 2");
		gm();
	}
    static void gm() {
    	System.out.println("static method 3");
    	System.out.println("================");
    	Testdemo1 t = new Testdemo1();
    	t.hello1();
    }
    void hello1(){
    	System.out.println("instance method 1");
    	hi1();
    		
    }
    void hi1() {
    	System.out.println("instance method 2");
    	gm1();
    	
    }
    void gm1() {
    	System.out.println("instance method 3");
    	System.out.println("================");
    
    }
    
}
