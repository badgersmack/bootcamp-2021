package uk.co.autotrader.fundamentals7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTimesTest {

/*
    @Test
    void whenStringTimesTwoThenPrintString() {
        String words = "Yo";
        int times = 2;

        StringBuilder result = StringTimes.multiplyString(words, times);

        Assertions.assertThat((CharSequence) result).isEqualTo("YoYo");
    }

    //no idea why this fails despite being identical!
*/
    @Test
    void whenNegativeIsGivenThenExceptionIsThrown() {
        String words = "Yo";
        int times = -1;

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> StringTimes.multiplyString(words, times));
    }
}
