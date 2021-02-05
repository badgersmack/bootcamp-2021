package uk.co.autotrader.fundamentals5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MathUtilTest {

    @ParameterizedTest(name = "When {0} provided, should be true")
    @ValueSource(ints = { 2, 4, 6, 8 })
    void whenProvidedANumberThenShouldReturnTrueIfEven(int inputValue) {
        boolean result = MathUtil.isEven(inputValue);

        Assertions.assertThat(result).isTrue();
    }
}
