package IfElse;

public class TemperatureCheck {
    public static void main(String[] args) {
        int temperature = 30;

        if (temperature >= 30) {
            System.out.println("It's hot outside.");
        } else if (temperature >= 20) {
            System.out.println("The weather is nice.");
        } else if (temperature >= 10) {
            System.out.println("It's a bit chilly.");
        } else {
            System.out.println("It's cold outside.");
        }
    }
}
