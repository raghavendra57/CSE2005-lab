package week3;

import java.util.Scanner;
import java.util.Arrays;

public class StringArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[10];

        // Input 10 strings
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            System.out.print("String " + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        // String operations
        System.out.println("\n--- String Operations ---");
        for (String word : words) {
            System.out.println("Original: " + word);
            System.out.println("Uppercase: " + word.toUpperCase());
            System.out.println("Length: " + word.length());
            System.out.println("Palindrome: " + isPalindrome(word));
            System.out.println();
        }

        // Array operations
        System.out.println("--- Array Operations ---");
        System.out.println("Original Array:");
        printArray(words);

        // Sorting
        Arrays.sort(words);
        System.out.println("\nSorted Array:");
        printArray(words);

        // Search operation
        System.out.print("\nEnter a word to search: ");
        String searchWord = sc.nextLine();
        boolean found = false;
        for (String word : words) {
            if (word.equals(searchWord)) {
                found = true;
                break;
            }
        }
