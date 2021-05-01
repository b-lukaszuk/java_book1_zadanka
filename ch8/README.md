# Java - programming exercises -> chapter 8

---

# Table of contents

1. [Info](#info)
3. [Task 1](#task-1)
4. [Task 2](#task-2)
5. [Task 3](#task-3)
6. [Task 4](#task-4)
7. [Task 5](#task-5)
8. [Task 6](#task-6)

---

# Info

I'm solving programming exercises that are placed at the end of each chapter in:
"Java in Two Semesters. Fourth edition" by Quentin Charatan and Aaron Kans

Starting from Chapter 5 (other chapters' exercises were too easy)

**Programming exercises from chapter 8 - Implementing Classes**

Here I'm gonna put the text from the book without the block quote (for better readibility)

# Task 1

## Task 1a

Implement the CircularShape class that was discussed in self-test question 1 above.

Reminder<br>

<pre>
|------------------------------------|
|                                    |
| CircularShape                      |
|                                    |
|------------------------------------|
|                                    |
| -radius: double                    |
|                                    |
|------------------------------------|
|                                    |
| +CircularShape(double)             |
| +setRadius(double)                 |
| +calculateArea(): double           |
| +calculateCircumference(): double  |
|                                    |
|------------------------------------|
</pre>


## Task 1b

Add the calculateDiameter method into this class as discussed in self-test question 1d and 1e above.

## Task 1c

Write a program to test out your class. This program should allow the user to enter a value for the radius of the circle, and then display the area, circumference and diameter of this circle on the screen by calling the appropriate methods of the CircularShape class.

## Task 1d

Modify the tester program above so that once the information has been displayed the user is able to reset the radius of the circle. The area, circumference and diameter of the circle should then be displayed again.

# Task 2

## Task 2a

Write the code for the Student class discussed in self-test question 2 above.

Reminder:

<pre>
|---------------------------------|
|                                 |
| Student                         |
|                                 |
|---------------------------------|
|                                 |
| -studentNumber: String          |
| -studentName: String            |
| -markForMaths: int              |
| -markForEnglish: int            |
| -markForScience: int            |
| -fee: doublle                   |
| -------------                   |
|                                 |
|---------------------------------|
|                                 |
| +Student(String, String)        |
| +getNumber(): String            |
| +getName(): String              |
| +enterMarks(int, int, int)      |
| +getMathsMark(): int            |
| +getEnglishMark(): int          |
| +getScienceMark(): int          |
| +calculateAverageMark(): double |
| +getFee(): double               |
| -----------------               |
| +setFee(double)                 |
| ---------------                 |
|                                 |
|---------------------------------|
</pre>

You should note that in order to ensure that a double is returned from the calculateAverageMark method you should specifically divide the total of the three marks by 3.0 and not simply by 3 (look back at Chap. 2 to remind yourself why this is the case).

Another thing to think about is what you choose for the initial values of the marks. If you chose to give each mark an initial value of zero, this could be ambiguous; a mark of zero could mean that the mark simply has not been entered—or it could mean the student actually scored zero in the subject! Can you think of a better initial value?

You can assume that the fees for the student are set initially to 3000.

## Task 2b

Write a tester class to test out your Student class; it should create two or three students (or even better an ArrayList of students), and use the methods of the Student class to test whether they work according to the specification.

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

# Task 4

The class shown below keeps track of a pressure sensor in a laboratory.

<pre>
|-------------------------------|
|                               |
| Sensor                        |
|                               |
|-------------------------------|
|                               |
| -pressure: double             |
|                               |
|-------------------------------|
|                               |
| +Sensor()                     |
| +Sensor(double)               |
| +setPressure(double): boolean |
| +getPressure(): double        |
|                               |
|-------------------------------|
</pre>

When a Sensor object is created using the first constructor, the initial pressure is set to zero. When it is created using the second constructor it is set to the value of the parameter.

The pressure should not be set to a value less than zero. Therefore, if the input parameter to the setPressure method is a negative number, the pressure should not be changed and a value of false should be returned. If the pressure is set successfully, a value of true should be returned.

## Task 4a

Write the code for the Sensor class.

## Task 4b

Develop a SensorTester program to test the Sensor class.

# Task 5

Consider a class that keeps track of the temperature within an incubator. The UML diagram is shown below:

<pre>
|-------------------------------|
|                               |
| Incubator                     |
|                               |
|-------------------------------|
|                               |
| -temperature: int             |
| +MAX: int                     |
| ---------                     |
| +MIN: int                     |
| ---------                     |
|                               |
|-------------------------------|
|                               |
| +Incubator()                  |
| +getTemperature(): int        |
| +increaseTemperature(boolean) |
| +decreaseTemperature(boolean) |
|                               |
|-------------------------------|
<pre>

When an Incubator object is created, the temperature is initially set to 5°.

The increaseTemp method increases the temperature by 1, and the decreaseTemp method decreases the temperature by 1. However, the temperature must never be allowed to rise above a maximum value of 10 nor fall below a minimum value of −10. If an attempt is made to increase or decrease the temperature so it falls outside this range, then an alarm must be raised; the methods in this case should not increase or decrease the temperature but should return a value of false, indicating that the alarm should be raised. If the temperature is changed successfully, however, a value of true is returned.

## Task 5a

Write the code for the Incubatotor class.

## Task 5b

Develop a IncubatorTester program to test the Incubator class.

# Task 6

Implement the changes to the Bank class and the BankApplication program suggested in question 4 of the self-test questions. The source code for the Bank class and the BankApplication class can be downloaded from the website.

