package extractprogramminglanguagenames;

import java.util.*;
import java.util.regex.*;

public class ProgrammingLanguageExtractor {
    private static final List<String> PROGRAMMING_LANGUAGES = Arrays.asList(
            "Java", "Python", "JavaScript", "C", "C++", "C#", "Go", "Swift",
            "Ruby", "PHP", "Kotlin", "Rust", "TypeScript", "Perl", "R", "Dart",
            "Scala", "Objective-C", "Haskell", "Lua"
    );

    // Method to extract programming languages from a text
    public static List<String> extractLanguages(String text) {
        List<String> extractedLanguages = new ArrayList<>();
        for (String language : PROGRAMMING_LANGUAGES) {
            String regex = "\\b" + Pattern.quote(language) + "\\b";
            if (Pattern.compile(regex).matcher(text).find()) {
                extractedLanguages.add(language);
            }
        }
        return extractedLanguages;
    }

    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Extract and print programming languages
        List<String> languages = extractLanguages(text);
        System.out.println("Extracted Languages: " + String.join(", ", languages));

    }
}
