/*
 * UC1: Application Entry & Welcome Message
 * Palindrome Checker App
 */

public class PalindromeCheckerApp {

    // Application Constants
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    /**
     * Main Method - Entry Point of the Application
     * JVM starts execution from here
     */
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("=======================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        " + APP_VERSION);
        System.out.println("=======================================");

        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("This application checks whether a given string");
        System.out.println("is a palindrome under different conditions.");
        System.out.println();

        System.out.println("Application started successfully.");
        System.out.println("Proceeding to next use case...");
    }
}