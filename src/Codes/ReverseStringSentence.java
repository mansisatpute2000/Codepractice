package Codes;

public class ReverseStringSentence {

	public static void main(String[] args) {
		String s="Mansi is great";
		
		String[] words =s.split(" ");
	
		String rev = "";
		for(int i = words.length-1 ;i>=0;i--)
		{
			rev=rev+words[i]+ " ";
		}
		System.out.println("reverse the string is :" +rev);
	}
	
	

}
