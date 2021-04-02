// built-in classes
import java.util.Scanner;

// custom classes
import classes.BankAccount;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class BankAccountsManager {

    private static BankAccount[] getBankAccounts(String[] accNums,
						 String[] accNames) {
	int howMany = accNums.length;
	BankAccount[] accounts;
	accounts = new BankAccount[howMany];

	for (int i = 0; i < howMany; i++) {
	    accounts[i] = new BankAccount(accNums[i],
					  accNames[i]);
	}
	return accounts;
    }

    // changes its argument (object BankAccount) INPLACE
    private static void askUsrForDeposits(BankAccount accountIn) {
	Scanner kbd = new Scanner(System.in);
	double curDeposit = 0;
        String usrAnotherDeposit = "n";
	    do {
		System.out.println("Enter the amount of money to deposit");

		curDeposit = kbd.nextDouble();
		accountIn.deposit(curDeposit);

		System.out.println("Another deposit [y/n]: ");
		usrAnotherDeposit = kbd.next();

	    } while (usrAnotherDeposit.equals("y"));

	    System.out.printf("All deposits have been placed%n%n");
     }

    private static void printAccountsDescriptions(BankAccount[] accounts) {
	for (int i = 0; i < accounts.length; i++) {
	    System.out.printf("Account nr: %s, name: %s, ballance (PLN) %.2f%n",
			      accounts[i].getAccountNumber(),
			      accounts[i].getAccountName(),
			      accounts[i].getBalance());
	}
     }

    public static void main(String[] args) {

	// variables
	String[] accountNums = {"0", "1"};
	String[] accountNames = {"John Doe's account",
				 "Jane Doe's account"};
	BankAccount[] accounts;
	accounts = getBankAccounts(accountNums, accountNames);

	Scanner kbd = new Scanner(System.in);
        int usrAccountChoice = -1;
	double currentDeposit = 0;

	// program execution
	System.out.println("Wellcome to bank accounts manager!\n");

	System.out.println("Choose an account number to make a deposit.\n");
	System.out.println("Available accounts:");
	printAccountsDescriptions(accounts);
	System.out.println("Your choice:");

	usrAccountChoice = kbd.nextInt();

	if (usrAccountChoice >= 0 && usrAccountChoice < accounts.length) {
	    askUsrForDeposits(accounts[usrAccountChoice]);
	} else {
	    System.out.println("Incorrect account number chosen.");
	    System.out.println("The program will now terminate.\n");
	}

	System.out.println("======");
	System.out.println("The accounts details after all the operation(s)");
	System.out.println("======");

	printAccountsDescriptions(accounts);

	System.out.println("");
	System.out.println("That's all. Goodbye!");
    }
}
