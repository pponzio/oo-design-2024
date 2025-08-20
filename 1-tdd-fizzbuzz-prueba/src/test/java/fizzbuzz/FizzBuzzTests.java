package fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTests {

    @Test
    public void test3isFizz() {
        int input = 3;
        String res = FizzBuzz.fizzBuzz(input);
        assertThat(res).isEqualTo("Fizz");
    }

    @Test
    public void test5isBuzz() {
        int input = 5;
        String res = FizzBuzz.fizzBuzz(input);
        assertThat(res).isEqualTo("Buzz");
    }

    @Test
    public void test15isFizzBuzz() {
        int input = 15;
        String res = FizzBuzz.fizzBuzz(input);
        assertThat(res).isEqualTo("FizzBuzz");
    }

    @Test
    public void test1is1() {
        int input = 1;
        String res = FizzBuzz.fizzBuzz(input);
        assertThat(res).isEqualTo("1");
    }

    @Test
    public void test1to10FizzBuzz() {
        int first = 1;
        int last = 10;
        List<String> results = FizzBuzz.fizzBuzzRange(first, last);
        assertThat(results).containsExactly(
            "1", "2", "Fizz", "4", "Buzz",
            "Fizz", "7", "8", "Fizz", "Buzz"
        );
    }

    @Test
    public void test13isFizz() {
        int input = 13;
        String res = FizzBuzz.fizzBuzz(input);
        assertThat(res).isEqualTo("Fizz");
    }

}
