package testAcc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Acc.Account;

public class TestAccount {


	@Test
	public void testAccount() {
		
		Account test1= new Account("New", "Person", 11);
		
//		test1.firstName = "New";
//		test1.lastName = "Person";
//		test1.accountNumber = 11;
		
		assertEquals("Faulty firstname", test1.getFullName(),"New");
		assertEquals("Faulty lastname", test1.getFullName(),"Person");
		assertEquals("Faulty accountNumber", test1.getAccountNo(), 11);
		
	}
}
