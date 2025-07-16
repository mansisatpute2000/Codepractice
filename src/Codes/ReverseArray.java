package Codes;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array= {10,70,30,40,50,60};
		int left=0;
		int right=array.length-1;
		while(left< right)
		{
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			left++;
			right--;
			
		}
		System.out.println("Reverse array is " +Arrays.toString(array));
	}

}
