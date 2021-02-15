package uk.co.autotrader.fundamentals8;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

public class Account {

    private final String accountNumber;
    private final String custFirstName;
    private final String custSurname;
    private final List<Transaction> transactions;

    private double balance;

    public Account(final String accountNumber, final String custFirstName, final String custSurname,
                   final double balance, final List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.custFirstName = custFirstName;
        this.custSurname = custSurname;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public String getCustSurname() {
        return custSurname;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double credit(final double amountToDeposit) {
        this.balance += amountToDeposit;

        this.transactions.add(new Transaction(new Date(), amountToDeposit, "IN - New transaction"));

        return this.balance;
    }

    public double debit(final double amountToWithdraw) {
        this.balance -= amountToWithdraw;

        this.transactions.add(new Transaction(new Date(), amountToWithdraw, "OUT - New transaction"));

        return this.balance;
    }

    public String toString() {
        return MessageFormat.format("Transactions:\n {0}", this.transactions);
    }

    public void setCustomerName(String customerName) {
        //code here i guess?
    }
}
