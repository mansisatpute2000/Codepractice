package Codes;

import java.util.Scanner;

public class FindDuplicatesstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String name=sc.nextLine();
		
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println("duplicate charcter is :" +name.charAt(j));
				}
			}
		}
		

	}

}
