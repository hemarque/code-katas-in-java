public class FizzBuzz {
    public String of(int number) {
        if(isDivisibleBy3(number) && isDivisibleBy5(number))
            return "FizzBuzz";
        else if (isDivisibleBy3(number) || hasA3InIt(number))
            return "Fizz";
        else if (isDivisibleBy5(number) || (number + "").contains("5")) {
            return "Buzz";
        } else
            return number+"";
    }

    private boolean hasA3InIt(int number) {
        return (number + "").contains("3");
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    public String first100Elements() {
        String response = "";
        for (int i=1;i<=100;i++)
            response = response + of(i)+"\n";
        return response;
    }
}
