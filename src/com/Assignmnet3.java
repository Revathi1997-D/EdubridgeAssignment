package com;

public class Assignmnet3 {
	static void pattern4()
	{
		for(int i=1;i<=3;i++)
		{
		for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
		for(int k=1;k<=2*i-1;k++)
			{
			if(k%2==0)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print("1");
				}
				
			}
		System.out.println();
		}
	}
	public static void main(String[] args) 
	{
	pattern4();
	
}
}
		
		



