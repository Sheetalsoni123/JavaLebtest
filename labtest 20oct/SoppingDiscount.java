/*
Program: WAP to discount shopping bill 
@author: sheetal soni
@Date: labtest 20oct 2022  
*/

//import packages 
import java.util.Scanner;

//declaring a class
class ShoppingDiscount 
  {
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int qty, dis;
       	  
		//taking input
		System.out.println("Enter Your Product Quantity");
	    int qty = sc.nextInt();
		int dis = sc.nextInt();
		
		//checking quantity
		if(qty>2000)
	     	 System.out.println("you have discount" + (qty*rate)*10/100));
			   
		else if(qty<2000)
			 System.out.println("You have not discount"+(qty*rate)*10/100));
		     
			 else
				 System.out.println("Exit");
			
			
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 