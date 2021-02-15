package uk.co.autotrader.fundamentals6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideTwoChallengeTest {

    @Test
    void whenNumberProvideDivideByTwo() {
        int number = 40;

        int divideResult = DivideTwoChallenge.countTwoDivideSofiya(number);

        Assertions.assertThat(divideResult).isEqualTo(5);
    }

    @Test
    void whenOddThenThrowException() {
        int number = 1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> DivideTwoChallenge.twoDivide(number));


    }


    @Test
    void whenNumberFortyProvidedDivideByTwo() {
        int number = 40;
        int expectedNumberOfTimes = 5;

        int result = DivideTwoChallenge.countTwoDivide(number);
        Assertions.assertThat(result).isEqualTo(expectedNumberOfTimes);
    }

    @Test
    void whenNumberSixDivideByTwo() {
        int number = 6;
        int expectedNumberOfTimes = 2;

        int result = DivideTwoChallenge.countTwoDivide(number);
        Assertions.assertThat(result).isEqualTo(expectedNumberOfTimes);
    }

}