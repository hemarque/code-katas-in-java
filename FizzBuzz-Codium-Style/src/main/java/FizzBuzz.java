public class FizzBuzz {
    public String of(int number) {
        if (isFizzBuzz(number))
            return "FizzBuzz";
        else if (isFizz(number))
            return "Fizz";
        else if (isBuzz(number))
            return "Buzz";
        else
            return String.valueOf(number);
    }

    public String getFirst100Elements() {
        String response = "";
        for (int i = 1; i <= 100; i++)
            response = response + of(i) + "\n";
        return response.trim();
    }


    private boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    private boolean isFizz(int number) {
        return isDivisibleBy3(number) || containsA3(number);
    }

    private boolean isBuzz(int number) {
        return isDivisibleBy5(number) || containsA5(number);
    }

    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    private boolean containsA3(int number) {
        return (number + "").contains("3");
    }

    private boolean containsA5(int number) {
        return (number + "").contains("5");
    }
}
