package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    public static String fizzBuzz(int input) {
        if (!isFizz(input) && !isBuzz(input))
            return String.valueOf(input);
        String res = "";
        if (isFizz(input))
            res += "Fizz";
        if (isBuzz(input))
            res += "Buzz";

        return res;
    }

    private static boolean isFizz(int input) {
        return isDivisibleBy(input, 3) ||
                Digits.containsDigit(String.valueOf(input),"3");
    }

    static boolean isBuzz(int input) {
        return isDivisibleBy(input, 5) ||
                Digits.containsDigit(String.valueOf(input),"5");
    }

    private static boolean isDivisibleBy(int input, int divisor) {
        return input % divisor == 0;
    }

    public static List<String> fizzBuzzRange(int first, int last) {
        return java.util.stream.IntStream.rangeClosed(first, last)
                .mapToObj(FizzBuzz::fizzBuzz).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> results = fizzBuzzRange(1, 100);
        results.forEach(System.out::println);
    }

}
