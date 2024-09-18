package com.coforge.exception;

public class account {
    private long accountId;
    private String accountName;
    private float balance;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) throws AccountException
    {
        if(accountName.isBlank())
            throw new AccountException("account name cannot be blank or have blank spaces");
        else if(accountName.length()<5 || accountName.length()>15)
            throw new AccountException("account name length must of 5 -15 characters");
        this.accountName = accountName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
