/*
 * UC12: Strategy Pattern for Palindrome Algorithms
 * Palindrome Checker App
 */

import java.util.*;

// 1️⃣ Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// 2️⃣ Stack-Based Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null) return false;

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// 3️⃣ Deque-Based Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null) return false;

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// 4️⃣ Context Class
class PalindromeService {

    private PalindromeStrategy strategy;

    // Strategy Injection (Constructor-based)
    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

// 5️⃣ Application Class
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "RaceCar";

        // Dynamically choose strategy
        PalindromeStrategy strategy = new StackStrategy();
        // You can switch to:
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.execute(input);

        System.out.println("Input String : " + input);
        System.out.println("Strategy Used: " + strategy.getClass().getSimpleName());

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
