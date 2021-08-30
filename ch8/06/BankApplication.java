import bookUtils.EasyScanner;

public class BankApplication {
    public static void main(String[] args) {
        char choice;

        Bank myBank = new Bank();

        // offer menu
        do {
            System.out.println();
            System.out.println("1. Create new account");
            System.out.println("2. Remove an account");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Check account details");
            System.out.println("6. Quit");
            System.out.println();
            System.out.print("Enter choice [1-6]: ");

            // get choice
            choice = EasyScanner.nextChar();
            System.out.println();

            // process menu options
            switch (choice) {
                case '1': option1(myBank);
                break;
                case '2': option2(myBank);
                break;
                case '3': option3(myBank);
                break;
                case '4': option4(myBank);
                break;
                case '5': option5(myBank);
                break;
                case '6': break;
                default: System.out.println("Invalid entry");
                }
            } while (choice != '6');
        }

        // add account
        static void option1(Bank bankIn) {
            // get details from user
            System.out.print("Enter account number: ");
            String number = EasyScanner.nextString();
            System.out.print("Enter account name: ");
            String name = EasyScanner.nextString();
            // add account to list
            boolean success = bankIn.addAccount(number, name);
            if(success) {
                System.out.println("Account added");
            } else {
                System.out.println("Account number already exists");
            }

        }

        // remove account
        static void option2(Bank bankIn) {
            // get account number of account to remove
            System.out.print("Enter account number: ");
            String number = EasyScanner.nextString();
            // delete item if it exists
            boolean found = bankIn.removeAccount(number);

            if (found) {
                System.out.println("Account removed");
            } else {
                System.out.println("No such account number");
            }
        }

        // deposit money in an account
        static void option3(Bank bankIn) {
            // get details from user
            System.out.print("Enter account number: ");
            String number = EasyScanner.nextString();
            System.out.print("Enter amount to deposit: ");
            double amount = EasyScanner.nextDouble();

            boolean found = bankIn.depositMoney(number, amount);

            if(found) {
                System.out.println("Money deposited");
            } else {
                System.out.println("No such account");
            }

        }

        // withdraw money from an account
        static void option4(Bank bankIn) {
            // get details from user
            System.out.print("Enter account number: ");
            String number = EasyScanner.nextString();
            System.out.print("Enter amount to withdraw: ");
            double amount = EasyScanner.nextDouble();
            int ok = bankIn.withdrawMoney(number, amount);

            if(ok == 1) {
                System.out.println("Withdrawal made");
            } else if (ok == -1) {
                System.out.println("No such account");
            } else if (ok == -2) {
                System.out.println("Not enough funds");
	    } else {
                System.out.println("An error occured" +
				   " while attemptin to withdraw money");
	    }
        }

        // check account details
        static void option5(Bank bankIn) {
            // get details from user
            System.out.print("Enter account number ");
            String number = EasyScanner.nextString();

            BankAccount account = bankIn.getItem(number);

            if(account != null) {
                    System.out.println("Account number: " + account.getAccountNumber());
                    System.out.println("Account name: " +account.getAccountName());
                    System.out.println("Balance: " + account.getBalance());
                    System.out.println();

                } else {
                    System.out.println("No such account");
                }
        }
}
