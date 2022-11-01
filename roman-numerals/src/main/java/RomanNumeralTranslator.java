public class RomanNumeralTranslator {

    public String toRoman(int number) {
        String roman = "";


        if (number >= 10) {
            roman = "X";
            number -= 10;
        }

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


        while (number >= 1) {
            roman = roman + "I";
            number -= 1;
        }

        return roman;
    }
}
