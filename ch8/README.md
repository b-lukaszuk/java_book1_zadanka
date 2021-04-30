# Java - programming exercises -> chapter 8

---

# Table of contents

1. [Info](#info)
3. [Task 1](#task-1)
4. [Task 2](#task-2)
5. [Task 3](#task-3)

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
| +setFee(double)                 |
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

+----------------------------------------+
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

## Task 3a

Write the code for the StockItem class.

## Task 3b




