package Codes;

public class RunLengthEncodingOfString {

	public static void main(String[] args) {
		String str="AAAbbccuuuu";
		//output=A3b2c2u4
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			sb.append(str.charAt(i)).append(count);
			i=i+count-1;
			
		}
		System.out.println("Length of the charcters are :"+sb);
	}

}
