import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import testingdateformatter.DateFormatter;

class DateFormatterTest {

    @Test
    void testValidDate() {
        assertEquals("16-02-2024", DateFormatter.formatDate("2024-02-16"), "Should convert correctly");
        assertEquals("31-12-1999", DateFormatter.formatDate("1999-12-31"), "Should convert correctly");
        assertEquals("09-05-2023", DateFormatter.formatDate("2023-05-09"), "Should convert correctly");
    }

    @Test
    void testInvalidDateFormat() {
        assertEquals("Invalid date format", DateFormatter.formatDate("16-02-2024"), "Wrong format should be invalid");
        assertEquals("Invalid date format", DateFormatter.formatDate("02/16/2024"), "Wrong format should be invalid");
        assertEquals("Invalid date format", DateFormatter.formatDate("invalid-date"), "Non-date input should be invalid");
    }

    @Test
    void testInvalidMonthOrDay() {
        assertEquals("Invalid date format", DateFormatter.formatDate("2024-13-01"), "Invalid month should be rejected");
    }

    @Test
    void testEmptyAndNullInput() {
        assertEquals("Invalid date format", DateFormatter.formatDate(""), "Empty input should be invalid");
    }
}

