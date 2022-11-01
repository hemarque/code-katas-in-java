import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTranslatorShould {
    @Test
    public void convertToRoman(){
        assertEquals("I", RomanNumeralTranslator.toRoman(1));
    }
}
