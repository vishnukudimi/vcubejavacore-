package com.javaintroduction;

public class Objectcount {
static int count=0;
{
    //instance block   	
    count++;
}

	
	public static void main (String[]args)
	{
		//object creation for instance variable
		
		Objectcount a = new Objectcount();
		System.out.println("count"+a.count);
		
		Objectcount b = new Objectcount();
		Objectcount c = new Objectcount();
		Objectcount d = new Objectcount();
	
		
		
		System.out.println("totalcount"+count);
		

		
				
		
		

}
}




































