package Codes;

public class FindTheCoccurenceoftheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Maansii";
		
		StringBuilder sb=new StringBuilder();
		boolean[] visited= new boolean[s.length()];
		for(int i=0;i<s.length();i++)
		{
			if (visited[i]) continue ;
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					visited[j]=true;
					break;
				}
			}
			System.out.println("Character '" + s.charAt(i) + "' occurs: " + count + " time(s)");
		}

	}

}
