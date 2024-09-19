package FncOrMethd;

public class Return {
    public static void main(String[] args) {
        int sumOfTwoNumber = sum(10, 22);
        System.out.println("Sum of two number is : " + sumOfTwoNumber);
    }

    public static int sum(int num1, int num2) {
        System.out.println("First number recieved : " + num1);
        System.out.println("Second number recieved : " + num2);
        int sum = num1 + num2;
        return sum;
    }
}
