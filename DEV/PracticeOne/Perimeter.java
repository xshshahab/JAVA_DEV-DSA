/* Create a program to calculate the perimeter of a rectangle.
    Formula : Perimeter = A + B + C + D
 */

package PracticeOne;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of A :  ");
        float A = scan.nextFloat();

        System.out.print("Enter value of B :  ");
        float B = scan.nextFloat();

        System.out.print("Enter value of C :  ");
        float C = scan.nextFloat();

        System.out.print("Enter value of D :  ");
        float D = scan.nextFloat();

        float result = A + B + C + D;
        System.out.println("Result : " + result);

        scan.close();
    }
}
