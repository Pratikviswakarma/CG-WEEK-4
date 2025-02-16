import static org.junit.jupiter.api.Assertions.*;

import extractprogramminglanguagenames.ProgrammingLanguageExtractor;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ProgrammingLanguageExtractorTest {

    @Test
    void testExtractLanguages() {
        assertEquals(Arrays.asList("Java", "Python", "JavaScript", "Go"),
                ProgrammingLanguageExtractor.extractLanguages("I love Java, Python, and JavaScript, but I haven't tried Go yet."));
        assertEquals(Arrays.asList("C", "C++", "C#", "Swift"),
                ProgrammingLanguageExtractor.extractLanguages("C, C++, C# are powerful, and Swift is great for iOS."));
        assertEquals(Collections.singletonList("Rust"),
                ProgrammingLanguageExtractor.extractLanguages("Rust is becoming popular for systems programming."));
        assertEquals(Collections.emptyList(),
                ProgrammingLanguageExtractor.extractLanguages("I enjoy painting and playing the guitar."));
    }

    @Test
    void testEdgeCases() {
        assertEquals(Collections.singletonList("R"),
                ProgrammingLanguageExtractor.extractLanguages("R is used for statistical computing."));
        assertEquals(Collections.singletonList("Go"),
                ProgrammingLanguageExtractor.extractLanguages("Let's Go hiking tomorrow!")); // Ensuring "Go" is correctly extracted.
        assertEquals(Collections.emptyList(),
                ProgrammingLanguageExtractor.extractLanguages(""));
    }
}

