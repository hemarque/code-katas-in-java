public class FizzBuzz {
    public String of(int number) {
        if(isDivisibleBy3(number) && isDivisibleBy5(number))
            return "FizzBuzz";
        else if (isDivisibleBy3(number))
            return "Fizz";
        else if (isDivisibleBy5(number)) {
            return "Buzz";
        } else
            return number+"";
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }
}
