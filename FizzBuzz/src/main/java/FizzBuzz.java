public class FizzBuzz {
    public static String of(int number) {
        if (isDivisibleBy3(number))
            return "Fizz";
        else if (number % 5 == 0) {
            return "Buzz";
        } else
            return number+"";
    }

    private static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }
}
