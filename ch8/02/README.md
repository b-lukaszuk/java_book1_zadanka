# Info

I'm solving programming exercises that are placed at the end of each chapter in:
"Java in Two Semesters. Fourth edition" by Quentin Charatan and Aaron Kans

Starting from Chapter 5 (other chapters' exercises were too easy)

**Programming exercises from chapter 8 - Implementing Classes**

Here I'm gonna put the text from the book without the block quote (for better readibility)

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

# Program execution

```bash
java Main.java
```
