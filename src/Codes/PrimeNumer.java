package Codes;

import java.util.Scanner;

public class PrimeNumer {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =  sc.nextInt(); 
		
		boolean isprime=true;
		for(int i = 2;i<n;i++)
		{
			if(n%i==0)
			{
				isprime=false;
			}
		}
		if(isprime)
		{
			System.out.println(" number is prime");
		}
		else
		{
			System.out.println(" number is not prime");
		}
	}

}
