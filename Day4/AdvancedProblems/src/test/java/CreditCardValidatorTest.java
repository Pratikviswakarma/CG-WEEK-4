import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import validatecreaditcardnumber.CreditCardValidator;

public class CreditCardValidatorTest {

    @Test
    void testValidVisaCards() {
        assertEquals("Valid Visa Card", CreditCardValidator.validateCreditCard("4111111111111111"));
        assertEquals("Valid Visa Card", CreditCardValidator.validateCreditCard("4000123412341234"));
    }

    @Test
    void testValidMasterCards() {
        assertEquals("Valid MasterCard", CreditCardValidator.validateCreditCard("5100123412341234"));
        assertEquals("Valid MasterCard", CreditCardValidator.validateCreditCard("5500123412341234"));
    }

    @Test
    void testInvalidCardNumbers() {
        assertEquals("Invalid Credit Card", CreditCardValidator.validateCreditCard("1234567890123456")); // Random digits
        assertEquals("Invalid Credit Card", CreditCardValidator.validateCreditCard("411111111111")); // Too short
        assertEquals("Invalid Credit Card", CreditCardValidator.validateCreditCard("6111111111111111")); // Invalid prefix
        assertEquals("Invalid Credit Card", CreditCardValidator.validateCreditCard("5a00123412341234")); // Contains letters
    }

    @Test
    void testEdgeCases() {
        assertEquals("Invalid Credit Card", CreditCardValidator.validateCreditCard("")); // Empty input
        assertEquals("Invalid Credit Card", CreditCardValidator.validateCreditCard("4111 1111 1111 1111")); // Spaces
        assertEquals("Invalid Credit Card", CreditCardValidator.validateCreditCard("4111-1111-1111-1111")); // Dashes
    }
}
