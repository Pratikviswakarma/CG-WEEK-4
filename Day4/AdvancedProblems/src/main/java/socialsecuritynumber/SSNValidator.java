package socialsecuritynumber;

import java.util.regex.*;
import java.util.Scanner;

public class SSNValidator {

    // Regular expression for SSN: Three digits, hyphen, two digits, hyphen, four digits (e.g., 123-45-6789)
    private static final String SSN_REGEX = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

    public static boolean isValidSSN(String ssn) {
        return Pattern.matches(SSN_REGEX, ssn);
    }

    public static void main(String[] args) {

        String ssn = "My SSN is 123-45-6789";

        // Validate and display the result
        if (isValidSSN(ssn)) {
            System.out.println(" is a valid SSN.");
        } else {
            System.out.println(" is an invalid SSN.");
        }


    }
}

