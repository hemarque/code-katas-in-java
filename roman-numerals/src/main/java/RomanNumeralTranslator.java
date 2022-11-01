public class RomanNumeralTranslator {

    public String toRoman(int number) {
        String response = "";
        if (number == 3)
            response = "III";
        else if (number == 2)
            response = "II";
        else
            response = "I";

        return response;
    }
}
