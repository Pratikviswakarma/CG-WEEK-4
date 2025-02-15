import static org.junit.jupiter.api.Assertions.*;

import basicregexproblems.LicensePlateNumber;
import org.junit.jupiter.api.Test;
public class LicensePlateValidatorTest {
    void testValidLicensePlates() {
        assertTrue(LicensePlateNumber.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateNumber.isValidLicensePlate("XY9876"));
        assertTrue(LicensePlateNumber.isValidLicensePlate("CD4567"));
    }

    @Test
    void testInvalidLicensePlates() {
        assertFalse(LicensePlateNumber.isValidLicensePlate("A12345"));
        assertFalse(LicensePlateNumber.isValidLicensePlate("ABC123"));
        assertFalse(LicensePlateNumber.isValidLicensePlate("AB12"));
        assertFalse(LicensePlateNumber.isValidLicensePlate("1234AB"));
        assertFalse(LicensePlateNumber.isValidLicensePlate("ab1234"));
        assertFalse(LicensePlateNumber.isValidLicensePlate("AB12C4"));
    }
}
