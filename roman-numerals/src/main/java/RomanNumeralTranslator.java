public class RomanNumeralTranslator {
    String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] arabics = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String toRoman(int number) {
        String roman = "";

        for (int i = 0; i < arabics.length; i++) {
            while (number >= arabics[i]) {
                roman = roman + romans[i];
                number -= arabics[i];
            }
        }

        return roman;
    }
}
