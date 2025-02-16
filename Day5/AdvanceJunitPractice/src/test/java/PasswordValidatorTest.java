import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import testingpasswordstrength.PasswordValidator;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongPass1"), "Should be valid");
        assertTrue(PasswordValidator.isValidPassword("Hello123"), "Should be valid");
    }

    @Test
    void testTooShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("Short1"), "Too short should be invalid");
    }

    @Test
    void testMissingUppercase() {
        assertFalse(PasswordValidator.isValidPassword("password1"), "No uppercase should be invalid");
    }

    @Test
    void testMissingDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoDigitsHere"), "No digit should be invalid");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should be invalid");
    }

    @Test
    void testOnlyNumbers() {
        assertFalse(PasswordValidator.isValidPassword("12345678"), "Only numbers should be invalid");
    }

    @Test
    void testOnlyUppercase() {
        assertFalse(PasswordValidator.isValidPassword("ONLYUPPER"), "Only uppercase should be invalid");
    }
}

