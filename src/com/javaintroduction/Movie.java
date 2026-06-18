package com.javaintroduction;

public class Movie {
	
	
	//static variable
		static int movieId;
		static String movieName;
		static String industryName;
	//instance variable
		int movieId1;
		String movieName1;
		String industryName1;

		
		public static void main (String[]args)	{
			movieId = 101;
			movieName="pushpa";
			industryName= "Tollywood"; 
			
	//obj creation
			Movie RRR = new Movie();
			RRR.movieId1 = 102;
			RRR.movieName1 = "Ramcharam,Rajamouli,Ram";
			RRR.industryName1="Tollywood";
		
System.out.println(movieId);
System.out.println(movieName);
System.out.println(industryName);

System.out.println(RRR.movieId1);
System.out.println(RRR.movieName1 );
System.out.println(RRR.industryName1);

}
		
	}
	

