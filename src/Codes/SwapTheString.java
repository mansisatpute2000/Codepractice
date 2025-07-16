package Codes;

public class SwapTheString {

	public static void main(String[] args) {
		String s="Mansi";
		String s1="Rekha";
		
		s=s+s1;
		s1=s.substring(0, s.length()-s1.length());
		s=s.substring(s1.length());
		
		System.out.println("Swap strings are Str1:"+s+" String 2: "+s1+"");

	}

}
