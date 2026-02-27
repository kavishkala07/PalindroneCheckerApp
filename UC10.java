/*
 * UC10: Case-Insensitive & Space-Ignored Palindrome
 * Palindrome Checker App
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "A man a plan a canal Panama";

        // Step 1: Normalize string (remove spaces & convert to lowercase)
        String normalized = original.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Apply palindrome logic (two-pointer approach)
        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Original String   : " + original);
        System.out.println("Normalized String : " + normalized);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome (ignoring case & spaces).");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
