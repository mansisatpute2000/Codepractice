package Codes;

public class CapitalizeFirstLetterofEachWord {

	public static void main(String[] args) {
		
		String word="mansi is greate!";
		
		StringBuilder cap= new StringBuilder();
		
		for (int i=0;i<=word.length()-1;i++)
		{
			if(i==0 || word.charAt(i-1)==' ')
			{
				cap.append(Character.toUpperCase(word.charAt(i)));
			}
			else
			{
				cap.append(word.charAt(i));
			}
		}
		
		System.out.println("Final string is " +cap);
	}

}
