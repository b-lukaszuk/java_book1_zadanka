# Info

I'm solving programming exercises that are placed at the end of each chapter in:
"Java in Two Semesters. Fourth edition" by Quentin Charatan and Aaron Kans

Starting from Chapter 5 (other chapters' exercises were too easy)

**Programming exercises from chapter 8 - Implementing Classes**

Here I'm gonna put the text from the book without the block quote (for better readibility)

# Task 3

A system is being developed for use in a store that sells electrical appliances. A class called StockItem is required for this system.

[...]

The design of the StockItem class is shown in the following UML diagram:

<pre>
+----------------------------------------+
|                                        |
|               StockItem                |
|                                        |
+----------------------------------------+
|                                        |
|- stockNumber: String                   |
|- name: String                          |
|- price: double                         |
|- totalStock: int                       |
|                                        |
+----------------------------------------+
|                                        |
|+StockItem(String, String, double)      |
|+setPrice(double)                       |
|+increaseTotalStock(int)                |
|+getStockNumber(): String               |
|+getName(): String                      |
|+getTotalStock(): int                   |
|+getPrice(): double                     |
|+calculateTotalPrice(): double          |
|                                        |
+----------------------------------------+
</pre>

## Task 3a

Write the code for the StockItem class.

## Task 3b

Consider the following program, which uses the StockItem class, and in which some of the code has been replaced by comments:

```java
import java.util.Scanner;

public class TestProg
{
    public static void main(String[] args)
    {
	Scanner keyboard = new Scanner(System.in);
	Scanner keyboardString = new Scanner(System.in);
	String tempNumber;
	String tempName;
	double tempPrice;
    }

    System.out.print("Enter the stock number: ");
    tempNumber = keyboardString.nextLine();
    System.out.print("Enter the name of the item: ");
    tempName = keyboardString.nextLine();
    System.out.print("Enter the price of the item: ");
    tempPrice = keyboard.nextDouble();

    // Create a new item of stock using the values that were entered by the user

    // Increase the total number of items in stock by 5

    // Display the stock number

    // Display the total price of all items in stock
}
```
Replace the comments with appropriate code.

## Task 3c

### i

A further attribute, salesTax, is required. The value of this attribute should always be the same for each object of the class. Write the declaration for this attribute.

### ii

Provide a class method, setSalesTax, for this class—it should receive a double and set the value of the sales tax to this value.

### iii

Write a line of code that sets the sales tax for all objects of the class to 10 without referring to any particular object.

# Program execution

```bash
java TestProg.java
```
