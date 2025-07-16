package Codes;

import java.util.Scanner;

public class FibonaciiRecusrsive {

	public static int fibonacii(int n)
	{
		
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
			
		}
		else
		{
			return fibonacii(n-1)+fibonacii(n-2);
		}
	}
	public static void main(String args[]) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the fibonacii numbers");
		int n = Sc.nextInt();
		
		for(int i =0 ;i<n ;i++) 
		{
			System.out.println(fibonacii(i));
		}
		
		Fibonaci fibo=new Fibonaci();
		fibo.fibonacii();
	}

}
