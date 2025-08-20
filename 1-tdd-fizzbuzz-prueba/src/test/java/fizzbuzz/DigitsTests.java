package fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class DigitsTests {

    @Test
    public void testDigits() {
        String input = "123";
        List<String> res = Digits.digits(input);
        assertThat(res).containsExactly("1", "2", "3");
    }

}
