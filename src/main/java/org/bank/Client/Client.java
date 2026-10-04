package org.bank.Client;

import java.util.Date;

interface IClient {
    String getClientName();
    String getBirthDate();

    void setClientName(String newName);
    void setBirthDate(Date newDate);
}


public class Client implements IClient {
    String clientName;
    Date birthDate;

    public Client(
        String clientName,
        Date birthDate
    ){
        this.clientName = clientName;
        this.birthDate = birthDate;
    }

    @Override
    public String getClientName(){ return this.clientName; }

    @Override
    public String getBirthDate(){ return this.birthDate.toString(); }

    @Override
    public void setClientName(String newName){ this.clientName = newName; }

    @Override
    public void setBirthDate(Date newDate) { this.birthDate = newDate; }
}
