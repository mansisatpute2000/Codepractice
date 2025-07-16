package Codes;

public class SecondLargestNumberInArray {
	public static void main(String[] args) {
		int[] a= {1,3,6,9,8};
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		
		for(int num : a)
		{
			if( num > largest)
			{
				secondlargest=largest;
				largest=num;
			}else if (num > secondlargest && num!=largest) {
				secondlargest=num;
				
			}
		}
		System.out.println("Second largest " +secondlargest);
		
		
	}

}
