import static org.junit.jupiter.api.Assertions.*;

import extractionproblems.LinkExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

public class LinkExtractorTest {
    @Test
    void testValidLinksExtraction() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> expected = List.of("https://www.google.com", "http://example.org");
        assertEquals(expected, LinkExtractor.extractLinks(text));
    }

    @Test
    void testMixedTextWithLinks() {
        String text = "Check https://openai.com and some text in between http://test.net/page.";
        List<String> expected = List.of("https://openai.com", "http://test.net/page");
        assertEquals(expected, LinkExtractor.extractLinks(text));
    }

    @Test
    void testNoValidLinks() {
        String text = "This text has no URLs.";
        List<String> expected = List.of();
        assertEquals(expected, LinkExtractor.extractLinks(text));
    }

    @Test
    void testLinksWithQueryParams() {
        String text = "Here is a search: https://www.google.com/search?q=java.";
        List<String> expected = List.of("https://www.google.com/search?q=java");
        assertEquals(expected, LinkExtractor.extractLinks(text));
    }

    @Test
    void testLinksWithSubdomains() {
        String text = "Visit https://sub.domain.example.com and http://blog.site.org.";
        List<String> expected = List.of("https://sub.domain.example.com", "http://blog.site.org");
        assertEquals(expected, LinkExtractor.extractLinks(text));
    }
}

