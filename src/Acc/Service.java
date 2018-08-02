package Acc;

import java.util.HashMap;

import org.json.JSONObject;



public class Service  {

	HashMap<Integer, Account> person = new HashMap<Integer, Account>();

	public HashMap<Integer, Account> getPerson() {
		return person;
	}

	public void addAccount(Account account) {
		person.put(account.getAccountNo(), account);

	}

	public Account retreiveAcc(int id) {
		return person.get(id);
	}

	public void deleteAcc(int id) {
		person.remove(id);
	}

	public JSONObject getHash() {
		return new JSONObject(person);
	}
}
