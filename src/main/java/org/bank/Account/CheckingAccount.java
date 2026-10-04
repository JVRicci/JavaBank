package org.bank.Account;

import org.bank.Utils.MoneyFormatter;

import javax.management.ValueExp;
import java.util.Date;


public class CheckingAccount extends Account{
    public CheckingAccount(int accountNumber, int agencyNumber, int accountBalance, String clientName, Date birthDate){
        super(
            accountNumber,
            agencyNumber,
            accountBalance,
            clientName,
            birthDate
        );
    }

    public String withdrawMoney(int value){
        if( value > this.getAccountBalance()){
            throw new IllegalArgumentException("Valor não pode ser maior que a quantidade em conta.");
        }

        return "Valor sacado com sucesso!";
    }

    public String getCurrentBalance(){
        return MoneyFormatter.toMoney(accountBalance);
    }
}
