import java.util.ArrayList;

public class Bank {

	ArrayList<BankAccount> list = new ArrayList<>();

	// helper method to find the index of a specified account
	private int search(String accountNumberIn) {
		for (int i = 0; i <= list.size() - 1; i++) {
			// find the account at index i
			BankAccount tempAccount = list.get(i);
			// get account number
			String tempNumber = tempAccount.getAccountNumber();
			// if this is the account we are looking for
			if (tempNumber.equals(accountNumberIn)) {
				return i; // return the index
			}
		}
		return -999;
	}

	// return the total number of items
	public int getTotal() {
		return list.size();
	}

	// return an account with a particular account number
	public BankAccount getItem(String accountNumberIn) {
		int index = search(accountNumberIn);
		// check that account exists
		if (index != -999) {
			return list.get(index);
		} else {
			return null; // no such account
		}
	}

	// add an item to the list
	public boolean addAccount(String accountNumberIn, String nameIn) {
		// check that account does not already exist
		if (search(accountNumberIn) == -999) {
			// add new account
			list.add(new BankAccount(accountNumberIn, nameIn));
			return true;
		}
		return false;
	}

	// deposit money in a specified account
	public boolean depositMoney(String accountNumberIn, double amountIn) {
		BankAccount acc = getItem(accountNumberIn);
		if (acc != null) {
			acc.deposit(amountIn);
			return true; // indicate success
		} else {
			return false; // indicate failure
		}
	}

	// withdraw money from a specified account
	public int withdrawMoney(String accountNumberIn, double amountIn) {
		BankAccount acc = getItem(accountNumberIn);
		if (acc == null) {
			return -1; // no such account indicator
		} else if (acc.getBalance() < amountIn) {
			return -2; // not enough founds indicator
		} else {
			acc.withdraw(amountIn);
			return 1; // success indicator
		}
	}

	// remove an account
	public boolean removeAccount(String accountNumberIn) {
		int index = search(accountNumberIn); // find index of account
		// if account exists account
		if (index != -999) {
			list.remove(index);
			return true; // remove was successful
		} else {
			return false; // remove was unsuccessful
		}
	}
}
