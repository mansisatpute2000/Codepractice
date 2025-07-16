package Codes;

public class FindTheLengthofLastWord {
    public static void main(String[] args) {
        String s = "Mansi is greate";
        int length=0;
        
        for(int i=s.length()-1 ;i>=0;i--)
        {
        	if(s.charAt(i)==' ')
        	{
        		if(length>0) break;
        	}
        	else
        	{
        		length++;
        	}
        }
        System.out.println("length of the last word is " +length);
    }
}
