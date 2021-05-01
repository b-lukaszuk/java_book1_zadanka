import java.util.Scanner;

import customClasses.StockItem;

public class TestProg {
    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	Scanner keyboardString = new Scanner(System.in);
	String tempNumber;
	String tempName;
	double tempPrice;
	StockItem stockItem1;

    // Write a line of code that sets the sales tax for all objects of
    // the class to 10 without referring to any particular object.
	StockItem.setSalesTax(10);

    System.out.print("Enter the stock number: ");
    tempNumber = keyboardString.nextLine();
    System.out.print("Enter the name of the item: ");
    tempName = keyboardString.nextLine();
    System.out.print("Enter the price of te item: ");
    tempPrice = keyboard.nextDouble();

    // Create a new item of stock using the values that were entered by the user
    stockItem1 = new StockItem(tempNumber, tempName, tempPrice);

    // Increase the total number of items in stock by 5
	stockItem1.increaseTotalStock(5);

    // Display the stock number
    System.out.printf("Stock number of the entered stock product is %s%n",
		      stockItem1.getStockNumber());

    // Display the total price of all items in stock
    System.out.printf("Total price of all the items in the stock is $%.2f%n",
		      stockItem1.calculateTotalPrice());

    System.out.printf("The prices do not include sales tax ($%.2f)%n",
		      StockItem.getSalesTax());
    }
}
