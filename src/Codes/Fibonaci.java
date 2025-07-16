package Codes;

import java.util.Scanner;

public class Fibonaci {
	
	public void fibonacii()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the fibonacii numbers");
		int Number = Sc.nextInt();
		
		int first=0;
		int second=1;
		for(int i=0;i<Number;i++)
		{
			int next=first+second;
			first=second;
			second=next;
			System.out.println("fibo is : " +next);
		}
		
		
		
	}
	public static void main(String args[]) 
	{
		Fibonaci fibo=new Fibonaci();
		fibo.fibonacii();
	}

}
