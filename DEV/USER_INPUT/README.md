# Java User Input Example

This README explains how to handle user input in Java using fundamental concepts.

## Concept Overview

### 1. **What is User Input?**

User input refers to the data or commands entered by the user through an input device such as a keyboard. In Java, handling user input allows programs to interact dynamically with users.

### 2. **Basic Input Handling in Java**

Java provides several ways to read input from the user. The most commonly used class for this purpose is `Scanner` from the `java.util` package. Here’s a conceptual breakdown of how user input is handled:

#### **a. Importing the Scanner Class**

To use the `Scanner` class, you must import it at the beginning of your Java program. This class provides methods to read different types of input from the console.

#### **b. Creating a Scanner Object**

An instance of the `Scanner` class is created to read input. This object is associated with the standard input stream (`System.in`), which reads input from the keyboard.

#### **c. Prompting for Input**

You can display a message to the user, asking them to enter data. This message is typically shown using `System.out.print()` or `System.out.println()`.

#### **d. Reading Input**

The `Scanner` object provides methods to read various types of data. For example:

- `nextInt()` reads an integer.
- `nextDouble()` reads a double.
- `nextLine()` reads a line of text.

When the user enters data and presses Enter, the `Scanner` object captures this input.

#### **e. Using the Input**

Once the input is captured, it can be stored in variables and used in the program. For example, you can perform calculations or make decisions based on the user’s input.

#### **f. Closing the Scanner**

After completing the input operations, it is a good practice to close the `Scanner` object. This releases the resources associated with it.

## Example Scenario

Imagine you want to build a simple program that asks the user for two numbers and then adds them together. The program would:

1. **Prompt** the user to enter the first number.
2. **Read** the number entered by the user.
3. **Prompt** the user to enter the second number.
4. **Read** the second number.
5. **Perform** the addition operation using the two numbers.
6. **Display** the result of the addition.

## Summary

Handling user input in Java involves:

- Importing the `Scanner` class.
- Creating a `Scanner` object.
- Prompting the user for input.
- Reading the input using `Scanner` methods.
- Using the input data in the program.
- Closing the `Scanner` when done.

By understanding these fundamental steps, you can interact with users and make your Java programs more dynamic and responsive to user needs.
