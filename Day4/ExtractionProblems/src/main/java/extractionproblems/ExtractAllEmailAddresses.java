package extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddresses {

    // Method to extract email addresses from a given text
    public static void extractEmails(String text) {
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group()); // Print each email found
            found = true;
        }

        if (!found) {
            System.out.println("No valid email addresses found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to extract emails from:");
        String text = scanner.nextLine();

        // Extract and print emails
        extractEmails(text);

        scanner.close();
    }
}
