# Info

I'm solving programming exercises that are placed at the end of each chapter in:
"Java in Two Semesters. Fourth edition" by Quentin Charatan and Aaron Kans

Starting from Chapter 5 (other chapters' exercises were too easy)

**Programming exercises from chapter 8 - Implementing Classes**

Here I'm gonna put the text from the book without the block quote (for better readibility)

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

# Program execution

```bash
java SensorTester.java
```
