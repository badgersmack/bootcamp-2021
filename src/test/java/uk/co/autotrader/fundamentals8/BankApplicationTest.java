package uk.co.autotrader.fundamentals8;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * You are in charge of making a new banking application. The business would like your application to manage accounts.
 *
 * An account is made up of the following details:
 *
 * 	-	Account number
 * 	-	Customer First Name
 * 	-	Customer Surname
 * 	-	Balance
 * 	-	A set of transactions
 *
 * Each Transaction has the following details:
 *
 * 	-	A Date of when then transaction occurred
 * 	-	The amount of money for the transaction
 * 	-	A description of the transaction
 *
 * Your task is to:
 * 	-	add accounts to your banking application
 * 	-	be able to debit accounts
 * 	-	be able to credit accounts
 * 	-	prevent any debit happening if the withdrawal amount takes you over zero
 *
 * For each debit a transaction is created
 *
 * For each credit a transaction is created
 *
 * Extension: You have to now handle different accounts. A current account and a savings account.
 *
 * A savings account cannot be debited.
 */
public class BankApplicationTest {

    private BankApplication bank;

    @BeforeEach
    public void setUp() {
        this.bank = new BankApplication();
    }

    @Test
    void whenBankApplicationCreatedThenReturnNewInstance() {
        // Arrange

        // Assert
        Assertions.assertThat(bank).isNotNull();

    }

    @Test
    void whenNewBankAccountDetailsProvidedThenBankApplicationCreatesAccount(){
        Account account = new Account("ABC123", "Mary", "Wales", 100,
                new ArrayList<>());

        // ACT
        boolean result = bank.newAccount(account);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void whenNoAccountDetailsProvidedThenExceptionIsThrown() {
        Account accountNew = new Account("", "","", 0,
                new ArrayList<>());

         Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                 () -> bank.newAccount(accountNew)
         );
    }
}
