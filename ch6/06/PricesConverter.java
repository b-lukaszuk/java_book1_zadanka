import java.util.Scanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class PricesConverter {

    // constants
    private static final int numOfProducts = 4;

    // variables
    private static double[] prodPricesPndsSterl = new double[numOfProducts];
    private static double[] prodPricesDollars = new double[numOfProducts];
    private static double exchangeRatio;

    // methods
    private static void displayPrices(String currency,
				      double[] prices) {
	for (int i = 0; i < prices.length; i++) {
	    System.out.printf("Price of product %d in %s: %.2f%n",
			      i+1, currency, prices[i]);
	}
     }

    // asks for prices of products in pounds sterlings
    private static double[] askUserForPrices(int howManyPrices) {
	double[] prices = new double[howManyPrices];
	Scanner kbd = new Scanner(System.in);
	for (int i = 0; i < prices.length; i++) {
	    System.out.printf("Enter the price %s of product %d:%n",
			      "(in pounds sterlings)", i+1);
	    prices[i] = kbd.nextDouble();
	}
	return prices;
     }

    private static double askUserForExchangeRatio() {
	double exchangeRatio;
	Scanner kbd = new Scanner(System.in);
	System.out.println("Enter the exchange ratio.");
	System.out.println("1 pound sterling = x dollar(s)");
	System.out.println("the x = ");
	exchangeRatio = kbd.nextDouble();
	return exchangeRatio;
     }

    private static double[] convertToDollars(double exchngRatio,
					     double[] prices) {
	double[] pricesDollars = new double[prices.length];
	for (int i = 0; i < prices.length; i++) {
	    pricesDollars[i] = prices[i] * exchngRatio;
	}
	return pricesDollars;
     }

    public static void main(String[] args) {
	System.out.printf("Hello. Enter the prices of %d products%n%n",
			  numOfProducts);

	prodPricesPndsSterl = askUserForPrices(numOfProducts);
	System.out.printf("The prices has been entered%n%n");

	exchangeRatio = askUserForExchangeRatio();
	System.out.printf("The exchange ratio has been entered%n%n");

	prodPricesDollars = convertToDollars(exchangeRatio,
					     prodPricesPndsSterl);

	System.out.println("Prices of products in pound(s) sterling");
	displayPrices("pound(s) sterling", prodPricesPndsSterl);
	System.out.println("");


	System.out.println("Prices of products in dollars");
	displayPrices("dollar(s)", prodPricesDollars);
	System.out.println("");

	System.out.println("That's all. Goodbye!");
    }
}
