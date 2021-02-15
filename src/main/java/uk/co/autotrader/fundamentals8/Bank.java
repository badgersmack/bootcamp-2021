package uk.co.autotrader.fundamentals8;

public class Bank {
    public static void main(String[] args) {
        AccountOther accountOther = new AccountOther();

        /*account.accountNumber = "ABC123";
        account.balance = 100.0d;
        account.customerEmail = "test@test.com";
        account.customerName = "John Doe";*/

        AccountOther improvedAccountOther = new AccountOther("ABD999", 90.0d,
                 "Susan Smith", "improved@test.com");

        improvedAccountOther.setCustomerName("Susan Jones");

        System.out.println(improvedAccountOther.toString());

        System.out.println(improvedAccountOther.getAccountNumber());

    }
}
