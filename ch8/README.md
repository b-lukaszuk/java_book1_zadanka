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
9. [Task 7](#task-7)
10. [Task 8](#task-8)
11. [Task 9](#task-9)

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

[...]

Another thing to think about is what you choose for the initial values of the marks. [...] (in the text of the chapter dummy variables, like -999, were used, BL)

You can assume that the fees for the student are set initially to 3000.

## Task 2b

Write a tester class to test out your Student class; it should create two or three students (or even better an ArrayList of students), and use the methods of the Student class to test whether they work according to the specification.

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

When a Sensor object is created using the first constructor, the initial pressure is set to zero. [...]

The pressure should not be set to a value less than zero. [...]

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
</pre>

When an Incubator object is created, the temperature is initially set to 5°.

The increaseTemp method increases the temperature by 1, and the decreaseTemp method decreases the temperature by 1. However, the temperature must never be allowed to rise above a maximum value of 10 nor fall below a minimum value of −10. [...] (if successful incr/decr of temp return true, else false, BL)

## Task 5a

Write the code for the Incubatotor class.

## Task 5b

Develop a IncubatorTester program to test the Incubator class.

# Task 6

Implement the changes to the Bank class and the BankApplication program suggested in question 4 of the self-test questions. The source code for the Bank class and the BankApplication class can be downloaded from the website.

<pre>
|-----------------------------------------|
|                                         |
| Bank                                    |
|                                         |
|-----------------------------------------|
|                                         |
| -list: ArrayList<BankAccount>           |
|                                         |
|-----------------------------------------|
|                                         |
| +search(String): int                    |
| +getTotal(): int                        |
| +getItem(String): BankAccount           |
| +addAccount(String, String): boolean    |
| +depositMoney(String, double): boolean  |
| +withdrawMoney(String, double): boolean |
| +removeAccount(String): boolean         |
|                                         |
|-----------------------------------------|
       ^
      / \
      \ /
       |
       |
       | *
|-------------|
|             |
| BankAccount |
|             |
|-------------|
|             |
| ??          |
|             |
|-------------|
|             |
| ??          |
|             |
|-------------|
<pre>

# Task 7

## Task 7a

In programming Exercise 6 of the last chapter you were asked to develop a program to process a collection of rooms in an apartment. Now consider a collection class, Apartment, for this purpose. The Apartment class would store a collection of Oblong objects, where each Oblong object represents a particular room in the apartment. The UML diagram depicting the association between the Apartment class and the Oblong class is shown below:

<pre>
|-----------------------------|
|                             |
| Apartament                  |
|                             |
|-----------------------------|
|                             |
| -rooms: ArrayList<Oblong>   |
|                             |
|-----------------------------|
|                             |
| +add(Room)                  |
| +getRoomArea(int): double   |
| +getRoomLength(int): double |
| +getRoomHeight(int): double |
|                             |
|-----------------------------|
       ^
      / \
      \ /
       |
       |
       | *
|-------------------------------|
|                               |
| Oblong                        |
|                               |
|-------------------------------|
|                               |
| -length: double               |
| -height: double               |
|                               |
|-------------------------------|
|                               |
| +Oblong(double, double)       |
| +getLength(): double          |
| +getHeight(): double          |
| +setLength(double)            |
| +setHeight(double)            |
| +calculateArea(): double      |
| +calculatePerimeter(): double |
|                               |
|-------------------------------|
</pre>

[...] (get methods return `some dummy value (for example -999)` if an invalid number is entered, BL)

## Task 7b

Develop an ApartmentTester program to test the Apartment class.

# Task 8

Consider a scenario in which a university allows lecturers to borrow equipment. The equipment is available for use 5 days a week and for 7 periods during each day. When the equipment is booked for use, the details of the booking (room number and lecturer name) are recorded. When no booking is recorded, the equipment is available for use.

## Task 8a

Create a Booking class defined in the UML diagram below:

<pre>
|-----------------------------|
|                             |
| Booking                     |
|                             |
|-----------------------------|
|                             |
| -room: String               |
| -name: String               |
|                             |
|-----------------------------|
|                             |
| +Booking(String, String)    |
| +getRoom(): String          |
| +getName(): String          |
|                             |
|-----------------------------|
</pre>

## Task 8b

Now a TimeTable class is defined to process these bookings. Its UML diagram is given below:

<pre>
|------------------------------------------|
|                                          |
| TimeTable                                |
|                                          |
|------------------------------------------|
|                                          |
| -times: Booking[][]                      |
|                                          |
|------------------------------------------|
|                                          |
| +TimeTable(int, int)                     |
| +makeBooking(int, int, Booking): boolean |
| +cancelBooking(int, int): boolean        |
| +isFree(int, int): boolean               |
| +getBooking(int, int): Booking           |
| +numberOfDays(): int                     |
| +numberOfPeriods(): int                  |
|                                          |
|------------------------------------------|
</pre>

As you can see, the attribute of this class is a two-dimensional array of Booking objects. The methods of this class are defined below:

[...]

## Task 8c

Write a suitable tester for this class.

# Task 9

Add some additional methods such as nextByte and nextLong to the EasyScanner class.
