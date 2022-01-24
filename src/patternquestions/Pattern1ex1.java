package patternquestions;

import java.util.Scanner;

public class Pattern1ex1
{
	public static void main(String[] args) 
	{
		int i, j;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" enter the number ");
		int n = scanner.nextInt();	
		
	      for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= n; j++)
			{
				System.out.print("*"); 
			}
			System.out.print("\n"); 
		}	
	}
} 