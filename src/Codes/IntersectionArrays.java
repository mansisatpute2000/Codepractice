package Codes;

public class IntersectionArrays {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		int[] a2= {1,5,6,4,5};
		
		for(int i =0 ;i<a.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a[i]==a2[j])
				{
					System.out.println("Intersect numbers are " +a[i]);
				}
			}
		}
	}

}
