package uk.co.autotrader.fundamentals8;

public class AccountOther {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;

    public AccountOther() {
    }

    public AccountOther(final String accountNumber, final double balance,
                        final String customerName, final String customerEmail) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;

        // possible but not preferred due to object orientation principles:
        // setCustomerName(customerName);

        this.customerEmail = customerEmail;
    }

    public void setCustomerName(String customerName) {
        if (customerName.startsWith("D")) {
            this.customerName = customerName;
        }
        else {
            System.out.println("No account allowed for customer");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}
