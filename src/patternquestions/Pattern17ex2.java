package patternquestions;
	
	public class Pattern17ex2
	{
		public static void main(String[] args) 
		{
				for(int i=8;i>=1;i--)
		{
			for(int j=8;j>=1;j--)
			{
			if(j>=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			for(int k=2;k<=8;k++)
			{
				if(k<=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(k);
				}
		}
			System.out.println();
		}
		for(int i=2;i<=8;i++)
		{
			for(int j=8;j>=1;j--)
			{
				
				if(j>=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			for(int k=2;k<=8;k++)
			{
				if(k<=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}
		

	}

}
