/*
Program: To Check oldest and youngest
@author: sheetal soni 
@Date: labtest 20oct 2022  
*/
//importing packages

import java.util.Scanner;

//declaring a class
class Oldestyoungest
{
	public static void main(String args[])
	{
		//creating variables
		int a,b,c;
		System.out.println("Enter Your Age a,b,c");
		Scanner sc=new Scanner(System.in);
		int a,b,c=sc.nextInt();
		
		if(a>b && b>c)
			System.out.println("Amit is older & sonu is younger");
		
		     else if(a>b && c>a) 
			    System.out,println("sonu is older & mohan is younger");
		
		       else if(b>a && a>c)
			       System.out.println("sumit is older & sonu is youngest");
		
		              else if(a>c && c>b) 
			             System.out,println("Amit is older & sumit is younger");	
	}// end of main
	
}// end of class 