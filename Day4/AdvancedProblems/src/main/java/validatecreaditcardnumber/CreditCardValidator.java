package validatecreaditcardnumber;

import java.util.regex.*;

public class CreditCardValidator {

    private static final String VISA_REGEX = "^4\\d{15}$";
    private static final String MASTERCARD_REGEX = "^5[1-5]\\d{14}$";

    // Method to validate a credit card number
    public static String validateCreditCard(String cardNumber) {
        if (cardNumber.matches(VISA_REGEX)) {
            return "Valid Visa Card";
        } else if (cardNumber.matches(MASTERCARD_REGEX)) {
            return "Valid MasterCard";
        } else {
            return "Invalid Credit Card";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        String cardNumber = scanner.nextLine();

        // Validate credit card and print result
        System.out.println(validateCreditCard(cardNumber));

        scanner.close();
    }
}

