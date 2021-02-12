package uk.co.autotrader.fundamentals7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void whenFactorialCalculatedThenResultProduced () {
        int result = Factorial.calculateFactorial();
        Assertions.assertThat(result).isEqualTo(3628800);
    }

}