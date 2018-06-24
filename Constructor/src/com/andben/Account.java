package com.andben;
import java.util.UUID;

public class Account {
    private UUID accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account() {
        this("no name", "no email", "no phone");

    }

    public Account(String name, String email, String phone) {
        UUID uuid = UUID.randomUUID();

        this.accountNumber = uuid;
        this.balance = 0;
        this.name = name;
        this.email = email;
        this.phone =phone;
        System.out.printf("Account created with account number " + this.accountNumber +
                "\nname:" + this.name +
                "\nemail: " + this.email +
                "\nmobile: " + this.phone +
                "\nbalance: " + this.balance + " dollars\n");
    }

    public Account(String email, String phone) {
        this("john doe", email, phone);
        this.email = email;
        this.phone = phone;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void desposit(double amount, UUID accountNumber) {
        if (this.accountNumber.equals(accountNumber)) {
            double oldBalance = balance;
            this.balance += amount;
            System.out.printf("\n\nOld Balance " + oldBalance+ " dollars\n");
            System.out.printf("Successfully deposited " + amount + " dollars\n");
            System.out.printf("New Balance " + this.balance + " dollars\n");
        } else {
            System.out.println("Invalid account number\n");
        }
    }

    public void withdraw(double amount, UUID accountNumber) {
        if (this.accountNumber.equals(accountNumber) && amount <= this.balance) {
            double oldBalance = balance;
            this.balance -= amount;
            System.out.printf("\n\nOld Balance " + oldBalance+ " dollars\n");
            System.out.printf("Successfully withdraw " + amount + " dollars\n");
            System.out.printf("New Balance " + this.balance + " dollars\n");
        } else {
            System.out.println("Wrong account number of insufficient funds");
        }
    }
}
