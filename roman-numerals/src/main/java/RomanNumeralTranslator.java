public class RomanNumeralTranslator {

    public String toRoman(int number) {
        if (number == 4)
            return "IV";
        String roman = "";
        for (int i = 0; i < number; i++)
            roman = roman + "I";

        return roman;
    }
}
