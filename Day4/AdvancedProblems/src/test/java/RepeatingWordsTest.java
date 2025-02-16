import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import repeatingwords.RepeatingWords;

import java.util.*;

public class RepeatingWordsTest {

    @Test
    void testFindRepeatingWords() {
        assertEquals(Set.of("is", "repeated"),
                RepeatingWords.findRepeatingWords("This is is a repeated repeated word test."));
        assertEquals(Set.of("hello"),
                RepeatingWords.findRepeatingWords("Hello hello world, hello again!"));
          }

    @Test
    void testNoRepeatingWords() {
        assertEquals(Collections.emptySet(),
                RepeatingWords.findRepeatingWords("Each word is unique in this sentence."));
    }

    @Test
    void testEdgeCases() {
        assertEquals(Set.of("the"),
                RepeatingWords.findRepeatingWords("The the the cat jumped over the fence."));
        assertEquals(Set.of("a"),
                RepeatingWords.findRepeatingWords("A a A a!"));
        assertEquals(Collections.emptySet(),
                RepeatingWords.findRepeatingWords(""));
    }
}

