// Create a program to calculate the product of two floating points numbers.

package PracticeOne;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float num1 = scan.nextFloat();

        System.out.print("Now, enter second number: ");
        float num2 = scan.nextFloat();

        System.out.println("Product  : " + num1 * num2);

        scan.close();
    }
}
