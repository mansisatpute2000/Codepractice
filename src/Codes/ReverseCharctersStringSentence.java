package Codes;

public class ReverseCharctersStringSentence {
	public static void main(String[] args) {
		String s="Mansi is Great";
		
		char[] ToCharWords=s.toCharArray();
		
		String rev="";
		for(int i=ToCharWords.length-1;i>=0;i--)
		{
			rev=rev+ToCharWords[i];
		}
		System.out.println("Reverse character string is : " +rev);
	}

}
