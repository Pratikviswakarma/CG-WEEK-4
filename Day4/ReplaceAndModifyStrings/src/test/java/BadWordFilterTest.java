import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import replaceandmodifystrings.BadWordFilter;

public class BadWordFilterTest {

    @Test
    void testBadWordsCensoring() {
        String text = "This is a damn bad example with some stupid words.";
        String expected = "This is a **** bad example with some **** words.";
        assertEquals(expected, BadWordFilter.censorBadWords(text));
    }

    @Test
    void testSentenceWithoutBadWords() {
        String text = "This is a clean sentence.";
        String expected = "This is a clean sentence.";
        assertEquals(expected, BadWordFilter.censorBadWords(text));
    }

    @Test
    void testBadWordsWithPunctuation() {
        String text = "What a dumb idea!";
        String expected = "What a **** idea!";
        assertEquals(expected, BadWordFilter.censorBadWords(text));
    }

    @Test
    void testBadWordsWithUppercase() {
        String text = "Damn! That was Stupid.";
        String expected = "****! That was ****.";
        assertEquals(expected, BadWordFilter.censorBadWords(text));
    }

    @Test
    void testOnlyBadWords() {
        String text = "Damn stupid idiot dumb";
        String expected = "**** **** **** ****";
        assertEquals(expected, BadWordFilter.censorBadWords(text));
    }
}
