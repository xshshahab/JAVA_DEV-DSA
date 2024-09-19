package FncOrMethd;

import java.util.Scanner;

public class FncReturn {
    public static void main(String[] args) {

        int first = readNumber();
        int second = readNumber();

        System.out.println("Sum of the number is : " + (first + second));

    }

    public static int readNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        return number;
    }
}
