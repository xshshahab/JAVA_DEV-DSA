# Java `if-else` Statement

## Introduction

The `if-else` statement in Java is a control flow statement that allows you to execute certain blocks of code based on a condition.

## Syntax

```java
if (condition) {
    // Block of code to execute if condition is true
} else {
    // Block of code to execute if condition is false
}
```

##### Example

```java
int number = 10;

if (number > 0) {
    System.out.println("The number is positive.");
} else {
    System.out.println("The number is not positive.");
}
```

In this example, the condition `number > 0` is evaluated. If it is true,
the code inside the `if` block is executed, and the message "The number is positive."
is printed. If the condition is false, the code inside the `else` block is executed,
and the message "The number is not positive." is printed.

## Nested if else

- You can also nest `if-else` statements.

### Syntax

```java
if (condition1) {
    // Block of code to execute if condition1 is true
} else if (condition2) {
    // Block of code to execute if condition2 is true
} else {
    // Block of code to execute if both condition1 and condition2 are false
}
```

### Example

```java
int number = -5;

if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
}
```

In this example, the condition `number > 0` is evaluated. If it is true,
the code inside the `if` block is executed, and the message "The number is positive."
is printed. If the condition is false, the condition `number < 0` is evaluated.
If it is true, the code inside the `else if` block is executed, and the message
"The number is negative." is printed. If both conditions are false, the code inside the `else` block is executed, and the message "The number is zero." is printed.
