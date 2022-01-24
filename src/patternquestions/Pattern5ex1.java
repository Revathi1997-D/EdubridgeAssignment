package patternquestions;
import java.util.Scanner;

public class Pattern5ex1
{
public static void main(String[] args)
{ 
     try(Scanner scanner=new Scanner(System.in))
     {
      System.out.println("Enter the number : ");
       int n=scanner.nextInt(); 
        for(int i=n;i>0;i--)
       {
         for(int j=0;j<i;j++)
          {
            System.out.print("*");
           }
        System.out.println();
       } 
     }
}
} 