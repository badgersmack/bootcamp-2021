package uk.co.autotrader.fundamentals5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanApprovalTest {
    @Test
    void whenLoanIsLessThanAvailableFundsThenReject() {
        //arrange
        double downPayment = 5000d;
        double availableFunds =10000d;


        // act
        boolean fundCheck = LoanApproval.fundCheck(downPayment, availableFunds);

        //assert
        Assertions.assertThat(fundCheck).isTrue();
    }

    @Test
    void whenDownPaymentNotHighEnoughThenReject() {
        //arrange
        double loanAmount = 20000d;
        double downPayment = 5000d;

        boolean tenPercentCheck = LoanApproval.tenPercentCheck(loanAmount, downPayment);

        Assertions.assertThat(tenPercentCheck).isTrue();
    }

}
