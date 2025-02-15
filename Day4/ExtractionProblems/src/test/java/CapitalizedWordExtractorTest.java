import static org.junit.jupiter.api.Assertions.*;
import extractionproblems.CapitalizedWordExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CapitalizedWordExtractorTest {

    @Test
    void testCapitalizedWordsExtraction() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> expected = List.of("Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York");
        assertEquals(expected, CapitalizedWordExtractor.extractCapitalizedWords(text));
    }

    @Test
    void testSentenceWithNoCapitalizedWords() {
        String text = "this is a lowercase sentence.";
        List<String> expected = List.of();
        assertEquals(expected, CapitalizedWordExtractor.extractCapitalizedWords(text));
    }

    @Test
    void testSentenceWithSingleCapitalizedWord() {
        String text = "Welcome to java programming.";
        List<String> expected = List.of("Welcome");
        assertEquals(expected, CapitalizedWordExtractor.extractCapitalizedWords(text));
    }

    @Test
    void testSentenceWithAllCapitalizedWords() {
        String text = "London Paris Berlin Rome";
        List<String> expected = List.of("London", "Paris", "Berlin", "Rome");
        assertEquals(expected, CapitalizedWordExtractor.extractCapitalizedWords(text));
    }

    @Test
    void testSentenceWithPunctuation() {
        String text = "Hello, World! The Sun is Bright.";
        List<String> expected = List.of("Hello", "World", "The", "Sun", "Bright");
        assertEquals(expected, CapitalizedWordExtractor.extractCapitalizedWords(text));
    }
}
