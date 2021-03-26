import java.util.Scanner;

// in general the functions do not check for the input corectness
public class MoneyExchangeCalculator {

    private static double convertPlnToOther(double amountPln,
					    double exchngRatio) {
	return amountPln * exchngRatio;
    }

    private static double getAmtOfPlnFromUser() {
	Scanner kbd = new Scanner(System.in);
	double amntOfMoney;
	System.out.println("How much money (PLN) would you like to change?");
	amntOfMoney = kbd.nextDouble();
	return amntOfMoney;
    }

    private static double getExchgRatioFromUser() {
	Scanner kbd = new Scanner(System.in);
	double exchngRatio;
	System.out.println("What is the exchange ratio?");
	exchngRatio = kbd.nextDouble();
	return exchngRatio;
    }

    private static double plnToDiffCurrency(double amntPLN,
					    double exchngRatio) {
	return amntPLN * exchngRatio;
    }

    private static void printExchgInfo(double amntPLN, double exchngRatio) {
	double amntAfterExchng = plnToDiffCurrency(amntPLN, exchngRatio);
	System.out.printf("%.2f (PLN) = %.2f (other currency)%n",
			  amntPLN, amntAfterExchng);
    }

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double plnToChange = 0;
	double exchangeRatio = 0;
	char usrAnswer;

	do {
	    System.out.println("=====");
	    plnToChange = getAmtOfPlnFromUser();
	    exchangeRatio = getExchgRatioFromUser();
	    printExchgInfo(plnToChange, exchangeRatio);
	    System.out.println("Do you want to exchange again? [Y/n]");
	    usrAnswer = keyboard.next().charAt(0);
	    System.out.println();

	} while (usrAnswer == 'Y' || usrAnswer == 'y');

	System.out.println("Terminating the program. Goodbye!");
    }
}
