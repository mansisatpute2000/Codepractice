package Codes;

import java.util.Scanner;

public class FindTheWhiteSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		for(int i=0; i<s.length() ; i++)
		{
			if(Character.isWhitespace(s.charAt(i)))
			{
				System.out.println("Index " + i + " -> '" + s.charAt(i) + "'");
			}
		}
		
		
	}

}
