package Codes;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s="aabbcdeff";
		
		for(int i=0;i<s.length();i++)
		{
			boolean unique=true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					unique=false;
					break;
				}
				
			}
			
			if(unique)
			{
				System.out.println("no repeating char is  :" +s.charAt(i));
				return;
			}	
			
		}
		System.out.println("non reapeative found");
	}

}
