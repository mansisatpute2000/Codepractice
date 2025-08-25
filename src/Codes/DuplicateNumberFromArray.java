package Codes;

public class DuplicateNumberFromArray {
	public static void main(String[] args) {
		
		int[] numbers= {1,2,2,3,4,4,5,6,6};
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					System.out.println("duplicates are : " +numbers[j]);
				}
			}
			
		}
	
	}
}