import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Harry Age
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);

        // 2. Average PCM Marks
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam's average mark in PCM is " + average);

        // 3. KM to Miles
        double km = 10.8;
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);

        // 4. Profit Calculation
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println("The Cost Price is INR " + costPrice +
                " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercentage + "%");

        // 5. Pen Distribution
        int pens = 14;
        int students = 3;
        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);

        // 6. Fee Discount
        double fee = 125000;
        double discountPercent = 10;

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        // 7. Volume of Earth
        double radius = 6378;
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is "
                + volumeKm + " and cubic miles is " + volumeMiles);

        // 8. KM to Miles (User Input)
        System.out.print("Enter km: ");
        double kmInput = sc.nextDouble();

        double milesInput = kmInput / 1.6;

        System.out.println("The total miles is " + milesInput +
                " mile for the given " + kmInput + " km");

        // 9. User Input Fee Discount
        System.out.print("Enter Fee: ");
        double feeInput = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountInput = sc.nextDouble();

        double discountAmount = feeInput * discountInput / 100;
        double finalDiscountedFee = feeInput - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalDiscountedFee);

        // 10. Height Conversion
        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInchesHeight = inches % 12;

        System.out.println("Your Height in cm is " + cm +
                " while in feet is " + feet +
                " and inches is " + remainingInchesHeight);

        // 11. Calculator
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Addition = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));
        System.out.println("Division = " + (num1 / num2));

        // 12. Area of Triangle
        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.println("Area in square centimeters = " + areaCm);
        System.out.println("Area in square inches = " + areaInches);

        // 13. Side of Square
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

        // 14. Feet to Yards and Miles
        System.out.print("Enter distance in feet: ");
        double distanceFeet = sc.nextDouble();

        double yards = distanceFeet / 3;
        double milesFromFeet = yards / 1760;

        System.out.println("Distance in yards = " + yards);
        System.out.println("Distance in miles = " + milesFromFeet);

        // 15. Total Purchase Price
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " +
                totalPrice + " if the quantity " +
                quantity + " and unit price is INR " + unitPrice);

        // 16. Maximum Handshakes
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("Maximum possible handshakes = " + handshakes);

        sc.close();
    }
}