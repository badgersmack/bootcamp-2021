package uk.co.autotrader.fundamentals5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    //GIVEN WHEN THEN
    //@Test
    //public void givenSimpleCalculatorWhenTwoNumbersAddedThenSumIsReturned() {
    //
    //}

    //SHOULD
    //@Test
    //public void shouldAddTwoNumbersThenReturnItsSum() {
    //
    //}

    //ABBV GWT
    @Test
    public void whenTwoNumbersAddedThenSumIsReturned() {
        // AAA

        // ARRANGE
        int firstNumber = 2;
        int secondNumber = 2;

        // ACT
        int result = SimpleCalculator.add(firstNumber, secondNumber);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(4);
        


    }

    @Test
    void whenTwoDifferentNumbersAreAddedThenSumIsReturned(){
        //Arrange
        int firstNumber = 2;
        int secondNumber = 4;

        //Act
        int result = SimpleCalculator.add(firstNumber, secondNumber);

        //Assert
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    void whenTwoNumbersAreSubtractedThenTheirSumIsReturned() {
        int firstNumber = 100;
        int secondNumber = 4;

        int result = SimpleCalculator.subtract(firstNumber, secondNumber);

        Assertions.assertThat(result).isEqualTo(96);
    }

    @Test
    void whenTwoDifferentNumbersAreSubtractedThenTheirSumIsReturned() {
        int firstNumber = 10;
        int secondNumber = 4;

        int result = SimpleCalculator.subtract(firstNumber, secondNumber);

        Assertions.assertThat(result).isEqualTo(6);
    }

    @DisplayName("Two numbers can be multiplied")
    @Test
    void whenTwoNumbersAreMultipliedThenTheirSumIsReturned() {
        int firstNumber = 10;
        int secondNumber = 4;

        int result = SimpleCalculator.multiply(firstNumber, secondNumber);

        Assertions.assertThat(result).isEqualTo(40);
    }

    @Test
    void whenTwoNumbersAreDividedThenTheirSumIsReturned() {
        double firstNumber = 6.0d;
        double secondNumber = 2.0d;

        double expectedValue = 3.0d;

        double result = SimpleCalculator.divide(firstNumber, secondNumber);

        Assertions.assertThat(result).isEqualTo(expectedValue);
    }

    @Test
    void whenNumberIsDividedByZeroThenThrowException() {
        double firstNumber = 6.0d;
        double secondNumber = 0.0d;

        Assertions.assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(
                        () -> SimpleCalculator.divide(firstNumber, secondNumber));

    }
}

