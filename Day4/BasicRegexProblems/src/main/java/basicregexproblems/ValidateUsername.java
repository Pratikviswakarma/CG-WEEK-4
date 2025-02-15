package basicregexproblems;

import java.util.Scanner;

public class ValidateUsername {
       // Method to validate the username
        public static boolean isValidUsername(String username) {
            return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
        }
        // Main method
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a username: ");
            String username = scanner.nextLine();

            // Validate the username
            if (isValidUsername(username)) {
                System.out.println("Valid username ");
            } else {
                System.out.println("Invalid username ");
            }
            scanner.close();
        }
}
