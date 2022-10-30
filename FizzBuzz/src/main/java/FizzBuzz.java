public class FizzBuzz {
    public static String of(int number) {
        if (number == 3)
            return "Fizz";
        else if (number == 5) {
            return "Buzz";
        } else
            return number+"";
    }
}
