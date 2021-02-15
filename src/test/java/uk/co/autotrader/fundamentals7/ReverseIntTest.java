package uk.co.autotrader.fundamentals7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ReverseIntTest {
    @Test
    void whenArrayInputtedThenNumbersReversed() {
        ArrayList<Integer> testArray = new ArrayList<>();

        testArray.add(1);
        testArray.add(2);
        testArray.add(3);

        ArrayList<Integer> expectedArray = new ArrayList<>();

        expectedArray.add(3);
        expectedArray.add(2);
        expectedArray.add(1);

        ArrayList<Integer> result = ReverseInt.reverseArray(testArray);

        Assertions.assertThat(result).isEqualTo(expectedArray);
    }
}
