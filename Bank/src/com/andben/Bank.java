package com.andben;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public static Bank createNewBank(String bankName) {
        return new Bank(bankName);
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) != null) {
            return false;
        }
        Branch newBranch = new Branch(branchName);
        this.branches.add(newBranch);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.addNewCustomer(customerName, initialAmount); //validation will be done Branch class
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.addCustomerTransaction(customerName, amount);
    }


    public void printBranches() {
        System.out.println("\n**** Branches for " + this.bankName + " ****\n");
        for (int i = 0; i < this.branches.size(); i++) {
            System.out.println("Name: " + this.branches.get(i).getBranchName());
        }
    }

    public boolean listBranchCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        branch.printCustomers(showTransactions);
        return true;
    }

    public Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
}
