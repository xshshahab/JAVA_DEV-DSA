// create a program to print star using function and while loop

package FncOrMethd;

public class Star {
    public static void main(String[] args) {
        printStar();
    }

    public static void printStar() {
        int i = 0;
        while (i < 5) {
            System.out.print("*");
            int j = 0;
            while (j < i) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
