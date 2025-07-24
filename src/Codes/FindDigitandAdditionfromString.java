package Codes;

public class FindDigitandAdditionfromString {

	public static void main(String[] args) {
		String input = "abc123xyz45";
		
		int sum=0;
		for(int i=0 ; i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				sum=sum+Character.getNumericValue(input.charAt(i));
			}
			
			
		}
		System.out.println(+sum);
	}

		


}

