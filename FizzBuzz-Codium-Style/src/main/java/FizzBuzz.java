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

    private boolean isFizzBuzz(int number) {
        return number % 15 == 0;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public String getFirst100Elements() {
        String response = "";
        for(int i = 1; i<= 100; i++)
            response = response + of(i)+"\n";
        return response.trim();
    }
}
