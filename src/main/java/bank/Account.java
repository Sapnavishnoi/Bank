package main.java.bank;

import java.util.Date;

public class Account {
    public String name;
    public String number;
    private double balance;
    private Date openingDate;
    public final int RATE_OF_INTEREST_PER_ANNUM = 8;

    public Account(String name, String number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.openingDate = openingDate;
    }

    @Override
    public String toString() {
        return name+","+number+","+balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }



}
