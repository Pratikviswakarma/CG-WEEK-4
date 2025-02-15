import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.regex.*;
public class ExtractAllEmailAddressesTest {
    // Helper method to extract emails as a single string
    private String getEmails(String text) {
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append("\n");
        }
        return result.toString().trim();
    }

    @Test
    void testValidEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        String expected = "support@example.com\ninfo@company.org";
        assertEquals(expected, getEmails(text));
    }

    @Test
    void testMixedText() {
        String text = "Hello john.doe@email.com, please contact jane123@domain.net for details.";
        String expected = "john.doe@email.com\njane123@domain.net";
        assertEquals(expected, getEmails(text));
    }

    @Test
    void testNoEmails() {
        String text = "This text has no email addresses.";
        assertEquals("", getEmails(text));
    }

    @Test
    void testEmailsWithSpecialCharacters() {
        String text = "Emails: user.name+tag1@domain.com, first_last@service.co.uk";
        String expected = "user.name+tag1@domain.com\nfirst_last@service.co.uk";
        assertEquals(expected, getEmails(text));
    }
}
