package com.andben;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static Branch createBranch(String branchName) {
        return new Branch(branchName);
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) != null) {
            return false;
        }
        Customer newCustomer = new Customer(customerName, initialAmount);
        this.customers.add(newCustomer);
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer == null) {
            return false;
        }
        existingCustomer.addTransaction(transaction);
        return true;
    }

    public void printCustomers(boolean showTransactions) {
        System.out.println("\n**** Customers for " + this.branchName + " ****\n");
        for (int i = 0; i < customers.size(); i++) {
            String customerName = customers.get(i).getName();
            System.out.println("Name customer " + (i + 1) + " is: " + customerName);
            if (showTransactions) {
                printCustomersTransactions(customerName);
            }
        }
    }

    public boolean printCustomersTransactions(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return false;
        }
        System.out.println("\n**** Transactions for " + customerName + " ****\n");

        for (int i = 0; i < customer.getTransactions().size(); i++) {
            System.out.println("Transaction: " + (i + 1) + "--->" + customer.getTransactions().get(i).intValue());
        }
        return true;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
