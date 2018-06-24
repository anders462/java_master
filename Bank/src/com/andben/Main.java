package com.andben;

public class Main {

    public static void main(String[] args) {

        Bank bankOfAmerica = Bank.createNewBank("Bank of America");
        Bank wellsFargo = Bank.createNewBank("Wells Fargo");

        bankOfAmerica.addNewBranch("Pleasant Hill");
        bankOfAmerica.addNewBranch("Concord");
        bankOfAmerica.addNewBranch("Walnut Creek");
        bankOfAmerica.addCustomer("Walnut Creek", "Maria", 100.00);
        bankOfAmerica.addCustomerTransaction("Walnut Creek", "Maria", 234.67);
        bankOfAmerica.addCustomerTransaction("Walnut Creek", "Maria", 1000.67);
        bankOfAmerica.addCustomerTransaction("Walnut Creek", "Maria", -300.67);

        wellsFargo.addNewBranch("New York");
        wellsFargo.addCustomer("New York", "George", 3456.98);
        wellsFargo.addCustomerTransaction("New York", "George", 677);

        wellsFargo.printBranches();
        wellsFargo.listBranchCustomers("New York", true);
        bankOfAmerica.printBranches();
        bankOfAmerica.listBranchCustomers("Walnut Creek", true);

        if (!bankOfAmerica.addNewBranch("Pleasant Hill")) {
            System.out.println("Branch already exists");
        }


    }
}
