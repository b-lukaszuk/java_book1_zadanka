package customClasses;

public class StockItem {
    private String stockNumber;
    private String name;
    private double price;
    private int totalStock;
    private static double salesTax;

    public StockItem(String stockNumberIn, String nameIn, double priceIn) {
	totalStock = 0;
	stockNumber = stockNumberIn;
	name = nameIn;
	price = priceIn;
    }

    public void setPrice(double newPrice) {
	price = newPrice;
    }

    public void increaseTotalStock(int incrByHowMany) {
	totalStock += incrByHowMany;
    }

    public String getStockNumber() {
	return stockNumber;
    }

    public String getName() {
	return name;
    }

    public int getTotalStock() {
	return totalStock;
    }

    public double getPrice() {
	return price;
    }

    public double calculateTotalPrice() {
	return totalStock * price;
    }

    public static void setSalesTax(double salesTaxIn) {
	salesTax = salesTaxIn;
    }

    // not required by the task description, added by me for testing
    public static double getSalesTax() {
	return salesTax;
    }
}
