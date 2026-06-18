package com.javaintroduction;

public class Cricketer {
//static variable declaration
	static int countryID;
	static String countryName;
	//instance variable
	int jerseyNo;
	String cricketerName;
	public static void main (String[] args) {
		System.out.println ("Welcome to indian cricket team");
		//insializing static varable
		countryID = 91;
		countryName = "India";
		System.out.println ("country id:"+countryID);
		System.out.println ("countey name:"+countryName);
		//obj creation
		Cricketer msd = new Cricketer();
	    msd.jerseyNo = 7;
	    msd.cricketerName = "mahendra singh dhoni";
	   
		 System.out.println ("jersey no:"+msd.jerseyNo);
			System.out.println ("cricketer name:"+msd.cricketerName);
System.out.println("==========================================");
			Cricketer virat = new Cricketer();
			virat.jerseyNo=18;
			virat.cricketerName="virat kholi";
			System.out.println ("country id:"+countryID);
			System.out.println ("countey name:"+countryName);
			 System.out.println ("jersey no:"+virat.jerseyNo);
				System.out.println ("cricketer name:"+virat.cricketerName);
			
			
		
	}


}
