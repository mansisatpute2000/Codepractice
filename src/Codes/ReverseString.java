package Codes;

import java.util.Scanner;

public class ReverseString {
	
//	String s ="mansi";
	String rev="";
	
	public void reverseString() {
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the stirng");
		String s= Sc.nextLine();
		
		for(int i = s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Rev is "+ rev);
		
		if(s.equals(rev))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}
	
	public static void main(String args[]) 
	{
		ReverseString RS=new ReverseString();
		RS.reverseString();
	}
}

