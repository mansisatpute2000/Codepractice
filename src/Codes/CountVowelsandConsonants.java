package Codes;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		
		String s="aeiomounst";
		
		int VCount=0;
		int CCount=0;
		
		String Vowels="aeiouAEIOU";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Vowels.indexOf(s.charAt(i))!=-1)
				{
					VCount++;
				}
			else {
				CCount++;
			}
		}
		System.err.println("Vowels are :" +VCount);
		System.err.println("constant are :" +CCount);
	}

}
