package IfElse;

public class DrivingLicenseEligibility {
    public static void main(String[] args) {
        int age = 20;
        boolean completedDrivingCourse = true;

        if (age >= 18 && completedDrivingCourse) {
            System.out.println("You are eligible for a driving license.");
        } else {
            if (age < 18) {
                System.out.println("You must be at least 18 years old to be eligible for a driving license.");
            }
            if (!completedDrivingCourse) {
                System.out.println("You must complete a driving course to be eligible for a driving license.");
            }
        }
    }
}
