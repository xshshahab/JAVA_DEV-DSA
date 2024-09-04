/* Create a program to calculate simple interest
 * formula : SI = ( p  * t * r) / 100
 */

package PracticeOne;

public class SimpleInterest {
    public static void main(String[] args) {
        int principal = 1000;
        int rate = 5;
        int time = 2;

        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
