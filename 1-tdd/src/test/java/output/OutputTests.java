package output;

import fizzbuzz.PrintFizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OutputTests {

    @Test
    public void testPrintFizzBuzz() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        MockOutput mock = new MockOutput();
        PrintFizzBuzz printer = new PrintFizzBuzz(mock);
        printer.printFizzBuzz(numbers);
        assertThat(mock.isInvoked()).isTrue();
    }

    @Test
    public void testPrintFizzBuzzTerminal() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        String expected = "1,2,Fizz,4,Buzz";
        Terminal mock = new Terminal();
        PrintFizzBuzz printer = new PrintFizzBuzz(mock);
        printer.printFizzBuzz(numbers);
        //assertThat(mock.isInvoked()).isTrue();
    }

}
