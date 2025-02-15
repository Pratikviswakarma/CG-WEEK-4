package basicregexproblems;

import java.util.Scanner;

public class LicensePlateNumber {

    // Method to validate the license plate number
    public static boolean isValidLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a license plate number: ");
        String plate = scanner.nextLine();

        if (isValidLicensePlate(plate)) {
            System.out.println("Valid license plate");
        } else {
            System.out.println("Invalid license plate");
        }

        scanner.close();
    }
}
