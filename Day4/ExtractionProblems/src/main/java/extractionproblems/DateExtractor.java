package extractionproblems;

import java.util.*;
import java.util.regex.*;

public class DateExtractor {

    // Method to extract dates in dd/mm/yyyy format from a given text
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        String dateRegex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";

        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }

        return dates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to extract dates from:");
        String text = scanner.nextLine();

        // Extract and print dates
        List<String> dates = extractDates(text);

        if (dates.isEmpty()) {
            System.out.println("No valid dates found.");
        } else {
            System.out.println("Extracted dates: " + String.join(", ", dates));
        }

        scanner.close();
    }
}

