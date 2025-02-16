package repeatingwords;

import java.util.*;
import java.util.regex.*;

public class RepeatingWords{

    // Method to find repeating words in a sentence
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);

        // Count occurrences of each word
        while (matcher.find()) {
            String word = matcher.group().toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }

        return repeatingWords;
    }

    public static void main(String[] args) {


        String text = "This is is a repeated repeated word test.";

        // Find and print repeating words
        Set<String> repeatingWords = findRepeatingWords(text);
        System.out.println("Repeating Words: " + String.join(", ", repeatingWords));

    }
}
