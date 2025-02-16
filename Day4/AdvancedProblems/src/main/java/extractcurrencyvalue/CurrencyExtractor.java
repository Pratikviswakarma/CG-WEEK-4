package extractcurrencyvalue;

import java.util.*;
import java.util.regex.*;

public class CurrencyExtractor {
    private static final String CURRENCY_REGEX = "\\$?€?£?[0-9]+(\\.[0-9]{2})?";

    // Method to extract currency values from a given text
    public static List<String> extractCurrencyValues(String text) {
        List<String> currencyValues = new ArrayList<>();
        Pattern pattern = Pattern.compile(CURRENCY_REGEX);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }

    public static void main(String[] args) {
       String text ="The price is $45.99, and the discount is 10.50.";

        // Extract and print currency values
        List<String> values = extractCurrencyValues(text);
        System.out.println("Extracted Currency Values: " + String.join(", ", values));
    }
}
