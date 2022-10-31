public class FizzBuzz {
    public String of(int number) {
        if (isFizz(number))
            return "Fizz";
        if (number == 5)
            return "Buzz";
        return String.valueOf(number);
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
