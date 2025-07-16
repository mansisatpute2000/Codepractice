package Codes;

public class SwapNumberwithoutBulitInFunction {
	public static void main(String[] args) {
		int a= 40;
		int b=30;
		
		a=a+b; //a=70
		b=a-b; //70-30=40
		a=a-b; //70-40=30
		
		System.out.println("Swap number of a " +a);
		System.out.println("Swap number of b " +b);		
	}
}
