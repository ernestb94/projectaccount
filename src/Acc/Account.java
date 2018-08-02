package Acc;



public class Account {

	private String firstName;
	private String lastName;
	private int accountNumber;

	public Account(String firstName, String lastName, int accountNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}

	public String getFullName() {
		return firstName + "_" + lastName;
	}

	public int getAccountNo() {
		return accountNumber;
	}

}
