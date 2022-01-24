package patternquestions;
import java.util.Scanner;

public class Pattern10ex1
	{
    public static void main(String[] args)
	{
   try(Scanner scanner = new Scanner(System.in))
    {
    System.out.println("Enter the elements");
   
    int n= scanner.nextInt();
    
    for(int i=n;i>=1;i--)
    {
    for(int j=n;j>i;j--)
     
    {
    System.out.print(" ");
    }
     
    for(int j=1;j<=i*2-1;j++)
    {
        System.out.print("*");
        }
    System.out.println();
    }
    System.out.println();
    }
	}
	}
    