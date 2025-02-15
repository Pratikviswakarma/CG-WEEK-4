package extractionproblems;

import java.util.*;
import java.util.regex.*;

public class LinkExtractor {

    // Method to extract links (URLs) from a given text
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        String urlRegex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\S*)?\\b";

        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }

        return links;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter text to extract links from:");
        String text = scanner.nextLine();

        List<String> links = extractLinks(text);

        if (links.isEmpty()) {
            System.out.println("No valid links found.");
        } else {
            System.out.println("Extracted links: " + String.join(", ", links));
        }

        scanner.close();
    }
}
