/* Create a program to convert Fahrenheit to Celcius
 *  Formula -> C = ( F - 32 ) * 5 / 9
 */

package PracticeOne;

public class Celcius {
    public static void main(String[] args) {
        double fahrenheit = 100;
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " F is equal to " + celcius + " C");
    }
}
