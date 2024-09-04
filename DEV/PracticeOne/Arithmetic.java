//  Create a program that takes two numbers and shows result of all arithmetic operators ( +, -, *, /, %).

package PracticeOne;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number one : ");
        int num1 = scan.nextInt();

        System.out.print("Now, enter second number : ");
        int num2 = scan.nextInt();

        System.out.println("\nAddition : " + (num1 + num2));
        System.out.println("\nSubtract : " + (num1 - num2));
        System.out.println("\nMultiplication : " + (num1 * num2));
        System.out.println("\nDivision : " + (num1 / num2));
        System.out.println("\nModulus : " + (num1 % num2));

        scan.close();
    }
}
