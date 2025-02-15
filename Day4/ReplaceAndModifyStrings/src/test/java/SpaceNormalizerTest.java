import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import replaceandmodifystrings.SpaceNormalizer;

public class SpaceNormalizerTest {

    @Test
    void testMultipleSpaces() {
        String text = "This   is   an   example   with   multiple   spaces.";
        String expected = "This is an example with multiple spaces.";
        assertEquals(expected, SpaceNormalizer.normalizeSpaces(text));
    }

    @Test
    void testLeadingAndTrailingSpaces() {
        String text = "   Trim leading and trailing spaces    ";
        String expected = "Trim leading and trailing spaces";
        assertEquals(expected, SpaceNormalizer.normalizeSpaces(text));
    }

    @Test
    void testSingleSpaces() {
        String text = "This is already fine.";
        String expected = "This is already fine.";
        assertEquals(expected, SpaceNormalizer.normalizeSpaces(text));
    }

    @Test
    void testOnlySpaces() {
        String text = "     ";
        String expected = "";
        assertEquals(expected, SpaceNormalizer.normalizeSpaces(text));
    }

    @Test
    void testNewlinesAndTabs() {
        String text = "This\t is\n an example \n with newlines\t and tabs.";
        String expected = "This is an example with newlines and tabs.";
        assertEquals(expected, SpaceNormalizer.normalizeSpaces(text));
    }
}
