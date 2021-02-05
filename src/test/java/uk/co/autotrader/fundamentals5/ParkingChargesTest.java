package uk.co.autotrader.fundamentals5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class ParkingChargesTest {


    @ParameterizedTest(name = "When hour {0} is provided, then cost {1} is returned")
    @MethodSource("chargeList")
    void whenHourValueIsProvidedThenCostIsReturned(int hourOfDay, int expectedCost) {
        int cost = ParkingCharges.calculateNCPParkingCharge(hourOfDay);
        Assertions.assertThat(cost).isEqualTo(expectedCost);
    }
    @ParameterizedTest(name = "When hour {0} is out of bounds, exception is thrown")
    @ValueSource(ints = {-1, -20, 24, 100})
    void whenInvalidHourIsGivenThenExceptionIsThrown(int hourOfDay) {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> ParkingCharges.calculateNCPParkingCharge(hourOfDay)
        );
    }


    private static Stream<Arguments> chargeList() {
        return Stream.of(
                Arguments.of(0, 300),
                Arguments.of(1, 300),
                Arguments.of(2, 300),
                Arguments.of(3, 300),
                Arguments.of(4, 300),
                Arguments.of(5, 350),
                Arguments.of(6, 350),
                Arguments.of(7, 350),
                Arguments.of(8, 350),
                Arguments.of(9, 350),
                Arguments.of(10, 500),
                Arguments.of(11, 500),
                Arguments.of(12, 500),
                Arguments.of(13, 500),
                Arguments.of(14, 500),
                Arguments.of(15, 700),
                Arguments.of(16, 700),
                Arguments.of(17, 700),
                Arguments.of(18, 700),
                Arguments.of(19, 700),
                Arguments.of(20, 400),
                Arguments.of(21, 400),
                Arguments.of(22, 400),
                Arguments.of(23, 400)
                );
    }
}
