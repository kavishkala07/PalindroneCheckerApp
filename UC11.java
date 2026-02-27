/*
 * UC11: Object-Oriented Palindrome Service
 * Palindrome Checker App
 */

// Service class that encapsulates palindrome logic
class PalindromeChecker {

    // Public method exposed to client (Encapsulation)
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize string (optional basic cleanup)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Using two-pointer approach internally
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Application class (Client)
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam";

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input String : " + input);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
