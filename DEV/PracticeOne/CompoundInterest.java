package PracticeOne;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 0.05;
        int time = 5;

        double CI = principal * (1 + (rate / 1000)) * time;
        System.out.println("Compound Interest is: " + CI);

    }
}
