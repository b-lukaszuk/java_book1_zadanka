import java.util.Scanner;

public class PricesConverter {


    // variables
    private static int numOfProducts;
    private static double[] prodPricesPndsSterl;
    private static double[] prodPricesDollars;
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

    private static double sumPrices(double[] prices) {
	double sum = 0;
	for (double price : prices) {
	    sum += price;
	}
	return sum;
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

    private static int askForNumOfProducts() {
	int howMany;
	Scanner kbd = new Scanner(System.in);
	System.out.println("How many product prices you want to enter?");
	howMany = kbd.nextInt();
	return howMany;
     }

    public static void main(String[] args) {

	System.out.println("Hello");

	numOfProducts = askForNumOfProducts();
	prodPricesPndsSterl = new double[numOfProducts];
	prodPricesDollars = new double[numOfProducts];

	System.out.printf("Enter the prices of %d products%n%n",
			  numOfProducts);

	prodPricesPndsSterl = askUserForPrices(numOfProducts);
	System.out.printf("The prices has been entered%n%n");

	exchangeRatio = askUserForExchangeRatio();
	System.out.printf("The exchange ratio has been entered%n%n");

	prodPricesDollars = convertToDollars(exchangeRatio,
					     prodPricesPndsSterl);

	System.out.println("Prices of products in pound(s) sterling");
	displayPrices("pound(s) sterling", prodPricesPndsSterl);
	System.out.printf("Total: %.2f pound(s) sterling%n%n",
			  sumPrices(prodPricesPndsSterl));

	System.out.println("Prices of products in dollars");
	displayPrices("dollar(s)", prodPricesDollars);
	System.out.printf("Total: %.2f dollars%n%n",
			  sumPrices(prodPricesDollars));

	System.out.println("That's all. Goodbye!");
    }
}
