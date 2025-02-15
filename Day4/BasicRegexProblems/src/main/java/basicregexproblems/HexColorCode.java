package basicregexproblems;

import java.util.Scanner;

public class HexColorCode {
    // Method to validate the hex color code
    public static boolean isValidHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hex color code: ");
        String color = scanner.nextLine();

        if (isValidHexColor(color)) {
            System.out.println("Valid hex color");
        } else {
            System.out.println("Invalid hex color");
        }

        scanner.close();
    }
}
