package com.javaintroduction;

public class Testdemo5 {
static Testdemo5 s = new Testdemo5();
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("=====================");
	vishnu();
	}
	//static method calling
		static void vishnu()
		{ 
			System.out.println("good morning everyone");
			System.out.println("my name is vishnu");
			keshav();
		}
		static void keshav()
		{
			System.out.println("am keshav");
			s.seema();		}
		
		void seema()
		{
			System.out.println("i am sreemanth");
			s.kumar();
		}
		void kumar()
		{
			System.out.println("this is kumar");
			System.out.println("main method ended");
			System.out.println("===========================");
		}

	}


