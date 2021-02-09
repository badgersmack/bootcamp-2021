package uk.co.autotrader.fundamentals6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RomanNumeralsTest {
    @ParameterizedTest
    @MethodSource("romanNumeralList")
    void whenOneIsProvidedThenIIsReturned() {
        int number = 1;

        String romanNumeral;
        romanNumeral = RomanNumerals.convertNumber(number);

        Assertions.assertThat(romanNumeral).isEqualTo("I");
    }

    private static Stream<Arguments> romanNumeralList() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(7, "VII"),
                Arguments.of(8, "VIII"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X")
        );
    }
}
