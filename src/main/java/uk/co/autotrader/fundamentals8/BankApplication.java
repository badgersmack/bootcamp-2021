package uk.co.autotrader.fundamentals8;

import java.util.ArrayList;
import java.util.List;

public class BankApplication {
    private List<Account> bankAccounts = new ArrayList();    
    
    public boolean newAccount(final Account account) {
        if (account.getAccountNumber().equals("") || 
                account.getCustFirstName().equals("") || 
                account.getCustSurname().equals("")) {
            throw new IllegalArgumentException();
        }
            
        return this.bankAccounts.add(account);
        
    }
}
