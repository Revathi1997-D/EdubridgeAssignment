package patternquestions;

import java.util.Scanner;

	public class Pattern2ex1
	{
    public static void main(String[] args)
	{
    try(Scanner scanner = new Scanner(System.in))
    {
    System.out.println("Enter the elements");
   
    int n= scanner.nextInt();
    for (int i= 1; i<= n; i++)
    {
    	for(int j= 1; j<= n; j++)
    	{
    		System.out.print(i);
    	}
    	System.out.println();
    }
    scanner.close(); 	
    }
}
	}