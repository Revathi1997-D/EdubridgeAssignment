package patternquestions;
	import java.util.Scanner;  
	public class Pattern11ex2  
	{  
	public static void main(String[] args) 
		{
			try(Scanner scanner=new Scanner(System.in))
			{
			System.out.println("Enter a number : ");
			int n=scanner.nextInt();          
	for (int i= 0; i<= n-1; i++)  
	{  
	for (int j=0; j<=i; j++)   
	{  
	System.out.print("*");  
	}   
	System.out.println("");   
	}   
	for (int i=n-1; i>=0; i--)  
	{  
	for(int j=0; j <= i-1;j++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");  
	}  
	}  
}
	}
