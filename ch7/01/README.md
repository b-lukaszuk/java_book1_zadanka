# Java - programming exercises

# Info

I'm solving programming exercises that are placed at the end of each chapter in:
"Java in Two Semesters. Fourth edition" by Quentin Charatan and Aaron Kans

Starting from Chapter 5 (other chapters' exercises were too easy)

# Programming exercises from chapter 7 - Classes and Objects

> In order to tackle these exercises make sure that the classes Oblong, Bank-
> Account and EasyScanner have been copied from the website and placed in
> the correct directory for your compiler to access them.
>
>
>
> 1.
>
> a. Implement the program given in self-test question 1 and run it to confirm
> your answer to part (d) of that question.

Self-test Question 1d
> What output would you expect to see from the program above?
Self-test Question 1d

My answer it will print:
The area of oblong1 is 12
The area of oblong2 is 30

>
> b. Adapt the program above so that the user is able to set the length and height
> of the two oblongs. Make use of the EasyScanner class to read in the
> user input.

# Running program

E.g.

```bash
java SampleProgram.java
```

# Additional info

No need to import class `Oblong` (file `Oblong.java`) if the file is in the same folder as the file `SampleProgram.java` (the main file).

For training I put Oblong class in a different file in a subdirectory, i.e. `classes`

In `Oblong.java` I added `package classes` at the top of the file

Then in shell:

```bash
javac Oblong # creates file: Oblong.class
```

Finally, I can import the class into: `SampleProgram.java` by placing in it: `import classes.Oblong;`

I did likewise for `EasyScanner.java`

Solution found on: https://www.w3schools.com/java/java_packages.asp
