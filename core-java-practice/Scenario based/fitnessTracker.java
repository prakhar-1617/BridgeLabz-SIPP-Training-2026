import java.util.Scanner;

public class fitnessTracker {
    public static void main(String[] args) {
    

        Scanner scanner = new Scanner(System.in);

        // Input height in meters
        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display BMI value
        System.out.printf("BMI: %.2f%n", bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } 
        else if (bmi < 25) {
            System.out.println("Category: Normal");
        } 
        else {
            System.out.println("Category: Overweight");
        }

        scanner.close();
    }

}
