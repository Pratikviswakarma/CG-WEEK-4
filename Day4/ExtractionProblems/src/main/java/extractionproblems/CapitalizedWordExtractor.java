package extractionproblems;

import java.util.*;
import java.util.regex.*;

public class CapitalizedWordExtractor {

    // Method to extract capitalized words from a given text
    public static List<String> extractCapitalizedWords(String text) {
        List<String> capitalizedWords = new ArrayList<>();
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        return capitalizedWords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Extract and print capitalized words
        List<String> capitalizedWords = extractCapitalizedWords(text);

        if (capitalizedWords.isEmpty()) {
            System.out.println("No capitalized words found.");
        } else {
            System.out.println("Capitalized words: " + String.join(", ", capitalizedWords));
        }

        scanner.close();
    }
}

