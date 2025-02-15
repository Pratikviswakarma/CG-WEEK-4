package replaceandmodifystrings;

import java.util.*;

public class BadWordFilter {

    private static final Set<String> badWords = new HashSet<>(Arrays.asList("damn", "stupid", "idiot", "dumb"));

    // Method to censor bad words in a given sentence
    public static String censorBadWords(String text) {
        String[] words = text.split("\\s+"); // Split sentence into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (badWords.contains(cleanWord)) {
                result.append("****");
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Censor bad words and print the result
        String censoredText = censorBadWords(text);
        System.out.println("Censored text: " + censoredText);

        scanner.close();
    }
}

