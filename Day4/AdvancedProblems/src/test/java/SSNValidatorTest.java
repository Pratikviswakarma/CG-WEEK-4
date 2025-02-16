import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import socialsecuritynumber.SSNValidator;

public class SSNValidatorTest {

    @Test
    void testValidSSN() {
        assertTrue(SSNValidator.isValidSSN("123-45-6789"));
        assertTrue(SSNValidator.isValidSSN("987-65-4321"));
    }

    @Test
    void testInvalidSSN() {
        assertFalse(SSNValidator.isValidSSN("123456789"));
        assertFalse(SSNValidator.isValidSSN("123-456-789"));
        assertFalse(SSNValidator.isValidSSN("123-45-678"));
        assertFalse(SSNValidator.isValidSSN("12-345-6789"));
        assertFalse(SSNValidator.isValidSSN("abc-de-ghij"));
    }

    @Test
    void testEdgeCases() {
        assertFalse(SSNValidator.isValidSSN(""));
        assertFalse(SSNValidator.isValidSSN("   "));
        assertFalse(SSNValidator.isValidSSN("123-45-6789 extra text"));
    }
}

