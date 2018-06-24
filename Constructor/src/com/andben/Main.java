package com.andben;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	Account anders = new Account("Anders Bengtsson", "anders462@gmail.com", "415-810-1249");

	UUID accountNumber = anders.getAccountNumber();


	anders.desposit(102.78, accountNumber);
	anders.desposit(602.78, accountNumber);
	anders.desposit(602.78, null);
	anders.withdraw(1000.78, accountNumber);

	VipCustomer teller = new VipCustomer("Anders Bengtsson", 100_000_000.00, "anders462@gmail.com");
		System.out.println("\n"
				+ teller.getName() + "\n"
				+ teller.getEmail() + "\n"
				+ teller.getCreditLimit());

	}
}
