package uk.co.autotrader.fundamentals6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import uk.co.autotrader.fundamentals7.RomanNumeralsKata;

import java.util.stream.Stream;

public class RomanNumeralsKataTest {

    @Test
    void whenOneIsInputtedThenReturnI() {

        int number = 1;

        String result = RomanNumeralsKata.whenNumberInputtedGiveRomanNumeral(number);

        String expectedValue = "I";

        Assertions.assertThat(result).isEqualTo(expectedValue);

    }

    @Test
    void whenTwoIsInputtedThenReturnII() {

        int number = 2;

        String result = RomanNumeralsKata.whenNumberInputtedGiveRomanNumeral(number);

        String expectedValue = "II";

        Assertions.assertThat(result).isEqualTo(expectedValue);

    }

    @ParameterizedTest
    @MethodSource("numberGenerator")
    void whenNumberIsInputThenReturnNumerals(int number, String expectedValue){
         String result = RomanNumeralsKata.whenNumberInputtedGiveRomanNumeral(number);
         Assertions.assertThat(result).isEqualTo(expectedValue);
    }

    private static Stream<Arguments> numberGenerator(){
        return Stream.of(
            Arguments.of(1,"I"),
            Arguments.of(2,"II"),
            Arguments.of(3,"III"),
            Arguments.of(4, "IV"),
            Arguments.of(5, "V"),
            Arguments.of(6, "VI"),
            Arguments.of(7, "VII")
        );
    }
}
