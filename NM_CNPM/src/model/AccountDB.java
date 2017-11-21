package model;

public class AccountDB {
	
	public static Account getAccount() {
		Account acc = new Account();
		acc.setName("Nguyen Van A");
		acc.setPassword("12345");
		acc.setMark(9);
		return acc;
	}

}
