import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTranslatorShould {
    RomanNumeralTranslator romanNumeralTranslator = new RomanNumeralTranslator();
    @Test
    public void convertToRoman(){
        assertEquals("I", romanNumeralTranslator.toRoman(1));
    }
}
