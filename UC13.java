/*
 * UC13: Performance Comparison
 * Palindrome Checker App
 */

import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("Input String : " + input);
        System.out.println("Normalized   : " + normalized);
        System.out.println("--------------------------------------");

        // Reverse String Approach
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(normalized);
        long end1 = System.nanoTime();

        // Stack Approach
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(normalized);
        long end2 = System.nanoTime();

        // Two Pointer Approach
        long start3 = System.nanoTime();
        boolean result3 = twoPointerMethod(normalized);
        long end3 = System.nanoTime();

        // Display Results
        System.out.println("Reverse Method Result     : " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method Result       : " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Two Pointer Method Result : " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        System.out.println("--------------------------------------");
        System.out.println("Performance comparison completed.");
    }

    // Method 1: Reverse String
    public static boolean reverseMethod(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // Method 2: Stack
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Two Pointer
    public static boolean twoPointerMethod(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
