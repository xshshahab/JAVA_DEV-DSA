// Create a program to swap two numbers
package PracticeOne;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Now, enter second number : ");
        int num2 = scanner.nextInt();

        int temp = num1;

        num1 = num2;

        num2 = temp;

        System.out.println("Number One : " + num1);
        System.out.println("Number Two : " + num2);

        scanner.close();

    }
}
