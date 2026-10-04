package org.bank.Account;

import org.bank.Client.Client;
import java.util.Date;

interface IAccount {
    int getAccountNumber();
    int getAgencyNumber();
    int getAccountBalance();

    void setAccountNumber(int newNumber);
    void setAgencyNumber(int newNumber);
    void setAccountBalance(int accountBalance);
}

public class Account extends Client implements IAccount {
    int accountNumber;
    int agencyNumber;
    int accountBalance;

    public Account(
        int accountNumber,
        int agencyNumber,
        int accountBalance,
        String clientName,
        Date birthDate
    ){
        super(clientName, birthDate);
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public int getAccountNumber(){ return this.accountNumber; }

    @Override
    public int getAgencyNumber(){ return this.agencyNumber; }

    @Override
    public int getAccountBalance(){ return accountBalance; }

    @Override
    public void setAccountNumber(int newNumber) { this.accountNumber = newNumber; }

    @Override
    public void setAgencyNumber(int newNumber) { this.agencyNumber = newNumber; }

    @Override
    public void setAccountBalance(int accountBalance) { this.accountBalance = accountBalance; }

}
