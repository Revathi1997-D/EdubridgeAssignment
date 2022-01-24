package patternquestions;
	import java.util.Scanner;  
	public class Pattern12ex1  
	{  
	public static void main(String[] args) 
		{
			try(Scanner scanner=new Scanner(System.in))
			{
			System.out.println("Enter a number : ");
			int n=scanner.nextInt();           
for (int i= 1; i<= n ; i++)  
{  
for (int j=i; j <n ;j++)             
{  
System.out.print(" ");  
}  
for (int k=1; k<=i;k++)   
{  
System.out.print("*");   
}   
System.out.println("");   
}   
for (int i=n; i>=1; i--)  
{  
for(int j=i; j<=n;j++)  
{  
System.out.print(" ");  
}  
for(int k=1; k<i ;k++)   
{  
System.out.print("*");  
}  
System.out.println("");  
}  
scanner.close();  
}  
}  
	}