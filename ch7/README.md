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
>
> b. Adapt the program above so that the user is able to set the length and height
> of the two oblongs. Make use of the EasyScanner class to read in the
> user input.
>
>
>
> 2. Consider a program to enter and confirm a suitable code name for an agent.
> Declare two string objects, called codeName and confirm and then
>
> a. Prompt to get the user to enter a suitable name into the codeName string;
>
> b. Use a while loop to ensure that the string entered is greater than 6 char-
> acters in length, if it is not print “INVALID CODENAME” and ask the user
> to re-enter a code name;
>
> c. Once a valid code name has been entered ask the user to re-enter the code
> name into the confirm string and then use an if else statement to ensure
> that the string entered matches the original code name; if it does, print a
> message “CODE NAME CONFIRMED” otherwise print a message saying
> “CODE NAME MIS-MATCH”;
>
> d. Use the charAt method to ensure that the code name ends with an ‘X’
> character;
>
> e. Finally use the startsWith method to ensure that, as well as being
> greater than 6 characters in length, the code name entered also starts with the
> words “Agent”.
>
>
>
> 3. Adapt the StringComparison program from Sect. 7.6.3, which compares
> two strings, in the following ways:
>
> a. Rewrite the program so that it ignores case;
>
> b. Rewrite the program, using the equals method, so that all it does is to test
> whether the two strings are the same;
>
> c. Repeat (b) using the equalsIgnoreCase method;
>
> d. Use the trim method so that the program ignores leading or trailing spaces.
>
>
>
> 4. Design and implement a program that performs in the following way:
>
> * When the program starts, two bank accounts are created, using names and
> numbers which are written into the code;
>
> * The user is then asked to enter an account number, followed by an amount to
> deposit in that account;
>
> * The balance of the appropriate account is then updated accordingly—or if an
> incorrect account number was entered a message to this effect is displayed;
>
> * The user is then asked if he or she wishes to make more deposits;
>
> * If the user answers does wish to make more deposits, the process continues;
>
> * If the user does not wish to make more deposits, then details of both accounts
> (account number, account name and balance) are displayed.
>
>
>
> 5. Write a program that creates an array of Oblong objects to represent the
> dimensions of rooms in an apartment as described in self test question 6. The
> program should allow the user to:
>
> * Determine the number of rooms;
> * Enter the dimensions of the rooms;
> * Retrieve the area and dimensions of any of the rooms.
>
>
>
> 6. Repeat the previous question making use of the ArrayList class.
