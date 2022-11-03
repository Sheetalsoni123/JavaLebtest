/* 
 * WAP 
 */
package com.ques1;

public class DimondPattern {
	
	public static void main(String[] args) {
		
		//outer for loop
		for(int i=1; i<=8; i++) 
		{
			//iner
			for(int j=8; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
			for(int i=7; i>=1; i--) 
			{
				
				for(int j=8; j>i; j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=(2*i-1);k++) 
				{
					System.out.print("*");
				}
				System.out.println();
		}
	}
	

}
