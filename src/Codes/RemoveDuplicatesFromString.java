package Codes;

import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();

        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) { 
                if (charArray[i] == charArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                sb.append(charArray[i]);
            }
        }

        System.out.println("String after removing duplicates: " + sb);
    }
}
