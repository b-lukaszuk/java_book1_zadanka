# Info

I'm solving programming exercises that are placed at the end of each chapter in:
"Java in Two Semesters. Fourth edition" by Quentin Charatan and Aaron Kans

Starting from Chapter 5 (other chapters' exercises were too easy)

**Programming exercises from chapter 8 - Implementing Classes**

Here I'm gonna put the text from the book without the block quote (for better readibility)

# Task 3

A system is being developed for use in a store that sells electrical appliances. A class called StockItem is required for this system. An object of the StockItem class will require the following attributes:

+ a stock number
+ a name
+ the price of the item
+ the total number of these items currently in stock

The first three of the above attributes will need to be set at the time a StockItem object is created—the total number of items in stock will be set to zero at this time. The stock number and name will not need to be changed after the item is created.

The following methods are also required:

+ a method that allows the price to be re-set during the object’s lifetime;
+ a method that receives an integer and adds this to the total number of items of this type in stock;
+ a method that returns the total value of items of this type in stock; this is calculated by multiplying the price of the item by the number of items in stock;
+ methods to read the values of all four attributes.

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
