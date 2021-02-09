package uk.co.autotrader.fundamentals6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OneToFiveHundredTest {
   /* @Test
    void whenMultipleOfThreePrint() {

        String result = OneToFiveHundred.printNumbers();

        Assertions.assertThat(result).isEqualTo("3");
    }now always fails*/

    @Test
    void whenMultipleOfFivePrint() {

        String result = OneToFiveHundred.printNumbers();

        Assertions.assertThat(result).isEqualTo("35");
    }

    @Test
    void whenRunPrintTotalsForThreeFive() {

        int total;
        total = OneToFiveHundred.printTotal();

        Assertions.assertThat(total).isEqualTo(8);
    }

    //tests should fail for 500
}
