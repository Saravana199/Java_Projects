package com.practicecorejava;

import java.util.Scanner;

public class Vowels_Constants {
	

	// Check if a character is a vowel (English vowels only)
	    private static boolean isVowel(char ch) {
	        switch (Character.toLowerCase(ch)) {
	            case 'a': case 'e': case 'i': case 'o': case 'u':
	                return true;
	            default:
	                return false;
	        }
	    }

	    // Check if a character is an English alphabetic letter
	    private static boolean isLetter(char ch) {
	        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	    }

	    /**
	     * Reorders characters so that:
	     *  - Vowels come first (left),
	     *  - Consonants next (center),
	     *  - Special characters last (right).
	     * Preserves the internal order within each group (stable).
	     */
	    public static String reorder(String input) {
	        if (input == null || input.isEmpty()) return input;

	        StringBuilder vowels = new StringBuilder();
	        StringBuilder consonants = new StringBuilder();
	        StringBuilder specials = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (isLetter(ch)) {
	                if (isVowel(ch)) {
	                    vowels.append(ch);
	                } else {
	                    consonants.append(ch);
	                }
	            } else {
	                specials.append(ch);
	            }
	        }

return vowels.append(consonants).append(specials).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        String result = reorder(input);
        System.out.println("Reordered: " + result);

        // Quick demos:
        // Input: "aB#cE3$Io-z" -> Output: "aEIoBcz#3$-"
        // Input: "Hello, World! 123" -> Output: "eooHllWrld, ! 123"
    }
}



