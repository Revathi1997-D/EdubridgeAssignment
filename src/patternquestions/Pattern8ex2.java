package patternquestions;
import java.util.Scanner;

public class Pattern8ex2
	{
    public static void main(String[] args)
	{
   try(Scanner scanner = new Scanner(System.in))
    {
    System.out.println("Enter the elements");
   
    int n= scanner.nextInt();
    
    for(int i=1;i<=n;i++)
    {
    for(int j=1;i%2!=0 && j<=n;j++)
         {
    System.out.print(i);
    int a=i;
    if(j==n)
    {
    	System.out.print(++a);
    }
    }
     
    for(int k=1;i%2==0 && k<=n;k++)
    {
    	int a=i;
       if(k==1)
       {
    	   System.out.print(++a);  
       }
       System.out.print(i);
    }
    System.out.println();
    }
	}
	}
	}