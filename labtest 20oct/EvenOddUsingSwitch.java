/*
Program: WAP to print the EvenOdd number using switch
@author: sheetal soni
@Date: lebtest 20oct 2022  
*/

//import packages 
import java.util.Scanner;

//declaring a class
class EvenOddUsingSwitch
{
	//main started
	public static void main(String args[])
	
	{
      //creating Scanner object
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number:");
		// creating variables
		int num= sc.nextInt();
	  
	   //switch case
	   switch(num 1%2)
	   {
		   case: System.out.println(num1+"is Even number");
		         break;
		   case: System.out.println(num2+" is odd number");
		         break;
		  default: System.out.println("Exit");
				  
	   }// end of switchcase
	
	}// end of main
	
}// end of class 