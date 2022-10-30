public class FizzBuzz {
    public static String of(int number) {
        if(isDivisibleBy3(number) && isDivisibleBy5(number))
            return "FizzBuzz";
        else if (isDivisibleBy3(number))
            return "Fizz";
        else if (isDivisibleBy5(number)) {
            return "Buzz";
        } else
            return number+"";
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    private static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }
}
