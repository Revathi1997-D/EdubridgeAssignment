	package patternquestions;

	import java.util.Scanner;
	public class Pattern15ex1 {

		public static void main(String[] args) 
		{
			try(Scanner scanner=new Scanner(System.in))
			{
			System.out.println("Enter a number : ");
			int n=scanner.nextInt();
			for(int i=1;i<=n;i++)
			{
			for(int j=1;j<=n;j++)
				{
					if((i==1) ||(i==n))
					{
						System.out.print("*");
					}
				else if((j==1)||(j==n))
					{
						System.out.print("*");
					}
					else if(j==i)
					{
						System.out.print("*");
					}
					else if((j==(n-i+1)))
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}

		}

	}
	}
