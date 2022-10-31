public class FizzBuzz {
    public String of(int number) {
        if (isFizz(number))
            return "Fizz";
        else if (isBuzz(number))
            return "Buzz";
        else
            return String.valueOf(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
