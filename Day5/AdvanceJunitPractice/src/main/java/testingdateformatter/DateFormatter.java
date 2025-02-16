package testingdateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // Convert yyyy-MM-dd to dd-MM-yyyy format
    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            return "Invalid date format";
        }
    }

    public static void main(String[] args) {
        String[] testDates = {"2024-02-16", "1999-12-31", "2023-05-09", "invalid-date", "2024-13-01"};

        for (String date : testDates) {
            System.out.println("Input: " + date + " -> Output: " + formatDate(date));
        }
    }
}

