package uk.co.autotrader.fundamentals5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DayOfMonthTest {

    @ParameterizedTest(name = "When {0} is provided, then month {1} text is returned")
    @MethodSource("monthDataProvider")
    void whenAValueProvidedThenReturnsMonthTextValue(int monthDigit, String expectedMonthString) {
        String result = DayOfMonth.getMonthTestByDigit(monthDigit);

        Assertions.assertThat(result).isEqualTo(expectedMonthString);
    }

    private static Stream<Arguments> monthDataProvider() {
        return Stream.of(
                Arguments.of(1, "JANUARY"),
                Arguments.of(2, "FEBRUARY"),
                Arguments.of(3, "MARCH"),
                Arguments.of(4, "APRIL"),
                Arguments.of(5, "MAY"),
                Arguments.of(6, "JUNE"),
                Arguments.of(7, "JULY"),
                Arguments.of(8, "AUGUST"),
                Arguments.of(9, "SEPTEMBER"),
                Arguments.of(10, "OCTOBER"),
                Arguments.of(11, "NOVEMBER"),
                Arguments.of(12, "DECEMBER"),
                Arguments.of(99, "Not a month")
        );
    }
}
