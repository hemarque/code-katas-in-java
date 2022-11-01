import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTranslatorShould {
    RomanNumeralTranslator romanNumeralTranslator = new RomanNumeralTranslator();
    @Test
    public void convertToRoman(){
        assertEquals("I", romanNumeralTranslator.toRoman(1));
        assertEquals("II", romanNumeralTranslator.toRoman(2));
        assertEquals("III", romanNumeralTranslator.toRoman(3));
        assertEquals("IV", romanNumeralTranslator.toRoman(4));
        assertEquals("V", romanNumeralTranslator.toRoman(5));
        assertEquals("VI", romanNumeralTranslator.toRoman(6));
        assertEquals("VII", romanNumeralTranslator.toRoman(7));
        assertEquals("VIII", romanNumeralTranslator.toRoman(8));
        assertEquals("IX", romanNumeralTranslator.toRoman(9));
        assertEquals("X", romanNumeralTranslator.toRoman(10));
        assertEquals("XXXIX", romanNumeralTranslator.toRoman(39));
        assertEquals("XL", romanNumeralTranslator.toRoman(40));


    }
}
