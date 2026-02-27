/*
 * UC9: Recursive Palindrome Checker
 * Palindrome Checker App
 */

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "racecar";

        boolean isPalindrome = checkPalindrome(original, 0, original.length() - 1);

        System.out.println("Original String : " + original);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }

    // Recursive method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindrome(str, start + 1, end - 1);
    }
}
