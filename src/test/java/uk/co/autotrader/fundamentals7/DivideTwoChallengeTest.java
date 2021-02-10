package uk.co.autotrader.fundamentals7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideTwoChallengeTest {
    @Test
    void whenNumberProvideDivideByTwo() {
        int number = 2;

        int divideResult = DivideTwoChallenge.twoDivide(number);

        Assertions.assertThat(divideResult).isEqualTo(1);
    }

}




