package uk.co.autotrader.fundamentals8;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();

        /*account.accountNumber = "ABC123";
        account.balance = 100.0d;
        account.customerEmail = "test@test.com";
        account.customerName = "John Doe";*/

        Account improvedAccount = new Account("ABD999", 90.0d,
                 "Susan Smith", "improved@test.com");

        improvedAccount.setCustomerName("Susan Jones");

        System.out.println(improvedAccount.toString());

        System.out.println(improvedAccount.getAccountNumber());

    }
}
