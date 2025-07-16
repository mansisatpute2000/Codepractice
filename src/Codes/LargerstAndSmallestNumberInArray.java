package Codes;

public class LargerstAndSmallestNumberInArray {

	public static void main(String[] args) {
		int[] a= {1,2,5,9,4};
		int max=a[0];
		int min=a[0];
		
		for(int i =0;i<a.length;i++)
		{
			if(max>a[i])
			{
				max=a[i];
			}
			if(min<a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Max number :" +max);
		System.out.println("Max number :" +min);
	}
}
