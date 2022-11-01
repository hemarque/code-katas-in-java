public class RomanNumeralTranslator {

    public String toRoman(int number) {
        String roman = "";

        if (number >= 9) {
            roman = "IX";
            number -= 9;
        }

        if (number >= 5) {
            roman = "V";
            number -= 5;
        }

        if (number >= 4) {
            roman = "IV";
            number -= 4;
        }


        for (int i = 0; i < number; i++)
            roman = roman + "I";
        return roman;
    }
}
