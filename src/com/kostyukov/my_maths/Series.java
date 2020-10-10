package com.kostyukov.my_maths;

public class Series
{
	public static long nSum(int n)
	{
		long sum = 0;
		
		for (int i = 0; i <= n; i++)
			sum += i;
		
		return sum;
	}
	
	public static long factorial(int f)
	{
		if (f == 0)
			return 0L;
		
		long factorial = 1;
		
		for (int i = 1; i <= f; i++)
			factorial *= i;
		
		return factorial;
	}
	
	public static long fibonacci(int n)
	{
		long[] fibonacci = new long[n + 2];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for (int i = 2; i <= n; i++)
		{
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		return fibonacci[n];
	}
}
