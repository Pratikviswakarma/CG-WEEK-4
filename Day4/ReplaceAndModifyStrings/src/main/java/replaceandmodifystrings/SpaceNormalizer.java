package replaceandmodifystrings;

import java.util.Scanner;

public class SpaceNormalizer {

    // Method to replace multiple spaces with a single space
    public static String normalizeSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Normalize spaces and print the result
        String result = normalizeSpaces(text);
        System.out.println("Normalized text: " + result);

        scanner.close();
    }
}

