package Acc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Service acc = new Service();
		Account person;
		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to do?");
		System.out.println("1. ADD Account");
		System.out.println("2. GET Account");
		System.out.println("3. REMOVE Account");
		Integer option = input.nextInt();

		if (option == 1) {
			System.out.println("Enter your first name : ");
			String first = input.next();
			System.out.println("Enter your last name : ");
			String last = input.next();
			System.out.println("Enter your account number : ");
			int accNum = input.nextInt();
			person = new Account(first, last, accNum);
			acc.addAccount(person);
			System.out.println("Congratulations your account is created!");
			System.out.println("Your full name : " + person.getFullName());
			System.out.println("Your acc number : " + person.getAccountNo());
			
		} else if (option == 2) {

			System.out.println("Enter your account number : ");
			int match = input.nextInt();
			//Figure how to match accNumber with user input...
		}

		else {
			System.out.println("Would you kindly follow instructions please...");
		}

	}
}
