package uk.co.autotrader.fundamentals7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumAverageTest {
    @Test
    void whenNumbersInputtedThenAverageIsFiftyPointFive() {
        //this is bad testing

        double average = SumAverage.calculateAverage();

        Assertions.assertThat(average).isEqualTo(50.5d);
    }

    @Test
    void whenNumbersInputtedThenSumIs5050() {
        //this is bad testing

        double sum = SumAverage.calculateSum();

        Assertions.assertThat(sum).isEqualTo(5050d);
    }
}
