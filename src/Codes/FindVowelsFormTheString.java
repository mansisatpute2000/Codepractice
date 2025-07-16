package Codes;

import java.util.Scanner;

public class FindVowelsFormTheString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String vowels="aeiouAEIOU";
		
		for(int i=0;i<s.length();i++)
		{
			if(vowels.indexOf(s.charAt(i))!=-1)
			{
				System.out.println("voewls are : " +s.charAt(i));
			}
		}
	}
}
