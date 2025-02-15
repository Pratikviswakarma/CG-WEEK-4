import static org.junit.jupiter.api.Assertions.*;

import basicregexproblems.HexColorCode;
import org.junit.jupiter.api.Test;

public class HexaColorCodeTest {

    @Test
    void testValidHexColors() {
        assertTrue(HexColorCode.isValidHexColor("#FFA500"));
        assertTrue(HexColorCode.isValidHexColor("#ff4500"));
        assertTrue(HexColorCode.isValidHexColor("#1A2B3C"));
        assertTrue(HexColorCode.isValidHexColor("#ABCDEF"));
    }

    @Test
    void testInvalidHexColors() {
        assertFalse(HexColorCode.isValidHexColor("FFA500"));
        assertFalse(HexColorCode.isValidHexColor("#123"));
        assertFalse(HexColorCode.isValidHexColor("#1234567"));
        assertFalse(HexColorCode.isValidHexColor("#GGGGGG"));
        assertFalse(HexColorCode.isValidHexColor("#12G45Z"));
    }
}
