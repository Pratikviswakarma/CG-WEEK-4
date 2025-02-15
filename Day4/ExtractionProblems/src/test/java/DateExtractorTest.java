import static org.junit.jupiter.api.Assertions.*;

import extractionproblems.DateExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

public class DateExtractorTest {

    @Test
    void testValidDatesExtraction() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> expected = List.of("12/05/2023", "15/08/2024", "29/02/2020");
        assertEquals(expected, DateExtractor.extractDates(text));
    }

    @Test
    void testMixedTextWithDates() {
        String text = "Today's date is 01/01/2022, but 32/12/2023 is not valid.";
        List<String> expected = List.of("01/01/2022");
        assertEquals(expected, DateExtractor.extractDates(text));
    }

    @Test
    void testNoValidDates() {
        String text = "There are no dates in this text.";
        List<String> expected = List.of();
        assertEquals(expected, DateExtractor.extractDates(text));
    }

    @Test
    void testVariousDateFormats() {
        String text = "Valid dates: 05/07/2020, 31/12/1999. Invalid: 2020/07/05, 15-08-2024.";
        List<String> expected = List.of("05/07/2020", "31/12/1999");
        assertEquals(expected, DateExtractor.extractDates(text));
    }

    @Test
    void testEdgeCaseDates() {
        String text = "Some dates: 30/04/2021, 31/06/2022, 29/02/2021 (invalid leap year).";
        List<String> expected = List.of("30/04/2021", "31/06/2022", "29/02/2021");
        assertEquals(expected, DateExtractor.extractDates(text));
    }
}

