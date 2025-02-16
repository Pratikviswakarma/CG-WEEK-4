import static org.junit.jupiter.api.Assertions.*;

import extractcurrencyvalue.CurrencyExtractor;
import org.junit.jupiter.api.Test;
import java.util.*;

public class CurrencyExtractorTest {

    @Test
    void testExtractCurrencyValues() {
        assertEquals(Arrays.asList("$45.99", "10.50"),
                CurrencyExtractor.extractCurrencyValues("The price is $45.99, and the discount is 10.50."));
        assertEquals(Arrays.asList("$100", "£20", "€30.50"),
                CurrencyExtractor.extractCurrencyValues("I have $100, £20, and €30.50 in my wallet."));
        assertEquals(Arrays.asList("50.00", "$5"),
                CurrencyExtractor.extractCurrencyValues("The tax is 50.00 and the shipping fee is $5."));
    }

    @Test
    void testEdgeCases() {
        assertEquals(Collections.emptyList(),
                CurrencyExtractor.extractCurrencyValues("There are no prices mentioned here."));
        assertEquals(Collections.singletonList("$0.99"),
                CurrencyExtractor.extractCurrencyValues("A small item costs only $0.99."));
        assertEquals(Collections.singletonList("75"),
                CurrencyExtractor.extractCurrencyValues("The number 75 is mentioned, but without a symbol."));
    }
}
