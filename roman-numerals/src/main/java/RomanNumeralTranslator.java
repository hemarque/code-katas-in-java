public class RomanNumeralTranslator {

    public String toRoman(int number) {
        String roman = "";


        while (number >= 10) {
            roman = roman + "X";
            number -= 10;
        }

        while (number >= 9) {
            roman = roman + "IX";
            number -= 9;
        }

        while (number >= 5) {
            roman = roman + "V";
            number -= 5;
        }

        while (number >= 4) {
            roman = roman + "IV";
            number -= 4;
        }


        while (number >= 1) {
            roman = roman + "I";
            number -= 1;
        }

        return roman;
    }
}
