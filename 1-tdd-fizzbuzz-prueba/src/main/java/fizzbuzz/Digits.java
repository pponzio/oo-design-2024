package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;

public class Digits {

    public static List<String> digits(String input) {
        return input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.toList());
    }

    public static boolean containsDigit(String input, String digit) {
        return digits(input).contains(digit);
    }

}
