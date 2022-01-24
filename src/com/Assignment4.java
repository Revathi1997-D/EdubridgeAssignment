package com;

public class Assignment4 {
	static void sol1()
	{
	System.out.println("Pattern 4 : ");
		int n = 3;
		for (int i = 1; i <= n; i++) {
	
		for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
		for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}

		System.out.println();
		}

	}
	public static void main(String[] args) 
	{
	sol1();
	
}
}
