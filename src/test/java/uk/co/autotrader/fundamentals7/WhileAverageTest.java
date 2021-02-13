package uk.co.autotrader.fundamentals7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhileAverageTest {

    @Test
    void whenNumbersInputtedThenWhileAverageIsFiftyPointFive() {

        double average = WhileAverage.calculateAverage();

        Assertions.assertThat(average).isEqualTo(50.5d);
    }

    @Test
    void whenNumbersInputtedThenWhileSumIs5050() {
        //this is bad testing

        double sum = WhileAverage.calculateSum();

        Assertions.assertThat(sum).isEqualTo(5050d);
    }

}
