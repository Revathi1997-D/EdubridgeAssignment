package patternquestions;

	import java.util.Scanner;
	public class Pattern13ex2 {

		public static void main(String[] args) 
		{
			try(Scanner scanner=new Scanner(System.in))
			{
			System.out.println("Enter a number : ");
			int n=scanner.nextInt();
		for (int i = 1; i <= n; i++) 
		{
		for (int j = 1; j <= n- i; j++) 
		{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) 
			{
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = n - 1; i > 0; i--) 
		{
			for (int j = 1; j <= n - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) 
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
	}
