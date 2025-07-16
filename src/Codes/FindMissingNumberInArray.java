package Codes;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,5,6,8};
		int n = 8;
		
		
		for(int i= 1;i<n ;i++)
		{
			boolean found=false;
			for(int j = 0 ;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.println("Missing numbers are " +i);
			}
		}
		
		

	}

}
