package com.andben;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
}
