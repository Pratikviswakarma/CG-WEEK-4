package validateipaddress;

import java.util.regex.*;

public class IPAddressValidator {

    // Regular expression for a valid IPv4 address (0-255.0-255.0-255.0-255)
    private static final String IP_REGEX =
            "\\b((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\b";

    // Method to validate an IPv4 address
    public static boolean isValidIPAddress(String ip) {
        return Pattern.matches(IP_REGEX, ip);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an IP address to validate: ");
        String ip = scanner.nextLine();

        // Validate IP and print result
        if (isValidIPAddress(ip)) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }

        scanner.close();
    }
}

