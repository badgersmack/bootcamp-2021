package uk.co.autotrader.fundamentals8;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AccountTest {

    @Test
    void whenAccountIsCreditedThenBalanceIsIncreased() {
        double amount = 90.0d;

        String accountNumber = "ABC123";
        String custFirstName = "John";
        String custSurname = "Doe";
        double balance = 0.0d;
        List<Transaction> transactions = new ArrayList<>();

        Account account = new Account(accountNumber, custFirstName, custSurname, balance, transactions);

        double balanceNow = account.credit(amount);

        Assertions.assertThat(balanceNow).isEqualTo(amount);
    }

    @Test
    void whenAccountIsDebitedThenBalanceIsDecreased() {
        double amount = 10.0d;

        double expectedBalance = 90.0d;

        String accountNumber = "ABC123";
        String custFirstName = "John";
        String custSurname = "Doe";
        double balance = 100.0d;
        List<Transaction> transactions = new ArrayList<>();

        Account account = new Account(accountNumber, custFirstName, custSurname, balance, transactions);

        double balanceNow = account.debit(amount);

        Assertions.assertThat(balanceNow).isEqualTo(expectedBalance);
    }
}