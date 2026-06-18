package com.javaintroduction;

public class Employee {

	//instance variable 
	 int empId;
	 String empName;
	  int salary;
	 String Deptname;
	 
	 public static void main (String[]args)
	 {
		 System.out.println("the details of thr empolyee fron vcube");
		 System.out.println("======================================");
		 
		 Employee DD = new Employee();
		 DD.empId = 579;
		 DD.empName = "vishnu";
		 DD.salary = 500000;
		 DD.Deptname = "full stack java";

		 System.out.println("empid is"+DD.empId);
		 System.out.println("empName is" +DD.empName);
		 System.out.println("salary is"+DD.salary);
		 System.out.println("Deptname is"+DD.Deptname);
		
	 }
	 

	

}
